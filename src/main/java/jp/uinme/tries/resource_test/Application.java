package jp.uinme.tries.resource_test;

import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

public class Application {
    public static void main(String[] args) {
        String s = null;
        if (StringUtils.isEmpty(s)) {
            System.out.println("null");
        }
        
        Properties propConf = new Properties();
        Properties prop = new Properties();
        try {
            propConf.load(ClassLoader.getSystemResourceAsStream("settings_conf.properties"));
            System.out.println(propConf.getProperty("setting1"));
            prop.load(ClassLoader.getSystemResourceAsStream("settings.properties"));
            System.out.println(prop.getProperty("setting2"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
