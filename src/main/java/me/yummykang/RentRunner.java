package me.yummykang;

import me.yummykang.model.Rent58Info;
import me.yummykang.pipeline.JDBCPipeline;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.downloader.HttpClientDownloader;
import us.codecraft.webmagic.model.OOSpider;
import us.codecraft.webmagic.proxy.Proxy;
import us.codecraft.webmagic.proxy.SimpleProxyProvider;

import java.sql.SQLException;

/**
 * write something to describe this file.
 *
 * @author demon
 * @date 18-1-26 下午3:13
 */
public class RentRunner {
    public static void main(String[] args) throws SQLException {
        HttpClientDownloader httpClientDownloader = new HttpClientDownloader();
//        httpClientDownloader.setProxyProvider(SimpleProxyProvider.from(new Proxy("220.163.30.134", 8888),
//                new Proxy("183.232.188.32", 8080),
//                new Proxy("61.54.219.75", 8080)));
        OOSpider.create(Site.me().setSleepTime(10000).setRetryTimes(10).setRetrySleepTime(1000)
                , new JDBCPipeline(), Rent58Info.class)
                .addUrl("http://sh.58.com/chuzu/0/pn1").thread(1).setDownloader(httpClientDownloader).run();
    }
}
