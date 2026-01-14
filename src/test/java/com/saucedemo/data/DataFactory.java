package com.saucedemo.data;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class DataFactory {
    private static JsonNode jsonNode;

    static {
        try {
            ObjectMapper mapper = new ObjectMapper();
            jsonNode = mapper.readTree(new File("src/test/resources/data/loginData.json"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getUsuario(String tipoUsuario) {
        return jsonNode.get(tipoUsuario).get("user").asText();
    }

    public static String getSenha(String tipoUsuario) {
        return jsonNode.get(tipoUsuario).get("pass").asText();
    }
}