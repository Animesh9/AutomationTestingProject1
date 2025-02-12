package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
    Properties pro;

    public ConfigDataProvider() {
        File src = new File("./src/main/Configuration/config.properties");

        try {
            FileInputStream fis= new FileInputStream(src);

            pro= new Properties();

            pro.load(fis);
        } catch (Exception e) {
            System.out.println("Not able to load config file "+e.getMessage());
        }
    }


    public String getBrowser() {
        // TODO Auto-generated method stub
        return pro.getProperty("browser");
    }



    public String getUrl() {
        // TODO Auto-generated method stub
        return pro.getProperty("testUrl");
    }
}
