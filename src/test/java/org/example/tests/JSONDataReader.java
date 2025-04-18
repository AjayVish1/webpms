package org.example.tests;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JSONDataReader {
    public static LoginData[] getLoginData() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(
                    new File("src/test/resources/logindata.json"),
                    LoginData[].class
            );
        } catch (IOException e) {
            e.printStackTrace();
            return new LoginData[0];
        }
    }
}
