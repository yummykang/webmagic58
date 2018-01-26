package me.yummykang.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.dbutils.QueryRunner;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * write something to describe this file.
 *
 * @author demon
 * @date 18-1-26 下午2:33
 */
@Slf4j
public class JdbcUtils {
    private static final String PROPERTIES_FILE_NAME = "db.properties";

    private static final PropertiesUtils properties = new PropertiesUtils(PROPERTIES_FILE_NAME);

    // 饿汉式
    private static DataSource ds = getDataSource();

    public static DataSource getDataSource() {
        ComboPooledDataSource ds = new ComboPooledDataSource();
        ds.setJdbcUrl(properties.getStringValue("db.url"));
        ds.setUser(properties.getStringValue("db.username"));
        try {
            ds.setDriverClass(properties.getStringValue("db.driverClass"));
        } catch (PropertyVetoException e) {
            log.error("driver {} not recognition", ds.getDriverClass());
            e.printStackTrace();
        }
        ds.setPassword(properties.getStringValue("db.password"));
        ds.setInitialPoolSize(properties.getIntValue("db.initialPoolSize"));
        ds.setAcquireIncrement(properties.getIntValue("db.acquireIncrement"));
        ds.setMinPoolSize(properties.getIntValue("db.minPoolSize"));
        ds.setMaxPoolSize(properties.getIntValue("db.maxPoolSize"));
        return ds;
    }

    /**
     * 它为null表示没有事务
     * 它不为null表示有事务
     * 当开启事务时，需要给它赋值
     * 当结束事务时，需要给它赋值为null
     * 并且在开启事务时，让dao的多个方法共享这个Connection
     */
    private static ThreadLocal<Connection> tl = new ThreadLocal<Connection>();

    /**
     * dao使用本方法来获取连接
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        /*
         * 如果有事务，返回当前事务的con
         * 如果没有事务，通过连接池返回新的con
         */
        Connection con = tl.get();//获取当前线程的事务连接
        if(con != null) return con;
        return ds.getConnection();
    }

    /**
     * 开启事务
     * @throws SQLException
     */
    public static void beginTransaction() throws SQLException {
        Connection con = tl.get();//获取当前线程的事务连接
        if(con != null) throw new SQLException("已经开启了事务，不能重复开启！");
        con = ds.getConnection();//给con赋值，表示开启了事务
        con.setAutoCommit(false);//设置为手动提交
        tl.set(con);//把当前事务连接放到tl中
    }

    /**
     * 提交事务
     * @throws SQLException
     */
    public static void commitTransaction() throws SQLException {
        Connection con = tl.get();//获取当前线程的事务连接
        if(con == null) throw new SQLException("没有事务不能提交！");
        con.commit();//提交事务
        con.close();//关闭连接
        con = null;//表示事务结束！
        tl.remove();
    }

    /**
     * 回滚事务
     * @throws SQLException
     */
    public static void rollbackTransaction() throws SQLException {
        Connection con = tl.get();//获取当前线程的事务连接
        if(con == null) throw new SQLException("没有事务不能回滚！");
        con.rollback();
        con.close();
        con = null;
        tl.remove();
    }

    /**
     * 释放Connection
     * @param connection
     * @throws SQLException
     */
    public static void releaseConnection(Connection connection) throws SQLException {
        Connection con = tl.get();//获取当前线程的事务连接
        if(connection != con) {//如果参数连接，与当前事务连接不同，说明这个连接不是当前事务，可以关闭！
            if(connection != null &&!connection.isClosed()) {//如果参数连接没有关闭，关闭之！
                connection.close();
            }
        }
    }

    public static QueryRunner getQueryRuner(){
        return new QueryRunner(ds);
    }
}
