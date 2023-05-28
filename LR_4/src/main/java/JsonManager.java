import Model.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class JsonManager {
    private Gson gson;

    public JsonManager() {
        gson = new GsonBuilder().setPrettyPrinting().create();
    }

    public void writeToJsonFile(Object o, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(o, writer);
            System.out.println("Successfully written to the file");
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }

    public Object readFromJsonFile(String filePath) {
        try (FileReader reader = new FileReader(filePath)) {
            return gson.fromJson(reader, University.class);
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        return null;
    }
}



