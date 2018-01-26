package me.yummykang.utils;

import com.sun.istack.internal.NotNull;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.Properties;

/**
 * write something to describe this file.
 *
 * @author demon
 * @date 18-1-26 下午2:28
 */
@Slf4j
public class PropertiesUtils {
    private Properties properties;

    public PropertiesUtils(String fileRelativePath) {
        load(fileRelativePath);
    }

    /**
     * load file in classpath files
     *
     * @param fileRelativePath file's relative path
     * @return java.util.Properties's instance
     */
    private void load(@NotNull String fileRelativePath) {
        Properties properties = new Properties();
        try {
            properties.load(PropertiesUtils.class.getClassLoader().getResourceAsStream(fileRelativePath));
        } catch (IOException e) {
            log.error("{} did not exist", fileRelativePath);
            e.printStackTrace();
        }
        this.properties = properties;
    }

    /**
     * return string value
     *
     * @param key properties's key
     * @return value
     */
    public String getStringValue(String key) {
        return properties.getProperty(key);
    }

    /**
     * return integer value
     *
     * @param key properties's key
     * @return value
     */
    public int getIntValue(String key) {
        return Integer.valueOf(properties.getProperty(key));
    }
}
