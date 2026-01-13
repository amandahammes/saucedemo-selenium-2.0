package com.saucedemo.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
    private static Properties properties;

    static {
        try {
            properties = new Properties();
            FileInputStream file = new FileInputStream("src/main/resources/url.properties");
            properties.load(file);
        } catch (IOException e) {
            throw new RuntimeException("ERRO: Não foi possível carregar o arquivo de configuração. Verifique o caminho.", e);
        }
    }

    public static String getProp(String key) {
        return properties.getProperty(key);
    }
}
