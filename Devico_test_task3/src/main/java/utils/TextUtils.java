package utils;

import com.google.gson.Gson;
import models.AnimalModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public  class TextUtils {

    public static AnimalModel getDataAboutAnimalsFromJsonFile() {
        Gson gson = new Gson();
        Reader reader = null;
        try {
            reader = Files.newBufferedReader(Paths.get("src/main/resources/animalsData.json"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return gson.fromJson(reader, AnimalModel.class);
    }
}
