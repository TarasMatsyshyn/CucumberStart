package utils;

import com.opencsv.CSVReader;
import models.UserModel;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVParser {

    public static List<UserModel> getUsersFromCSV(String csvPath) throws IOException {
        List<UserModel> userModelList = new ArrayList<>();
        CSVReader reader = new CSVReader(new FileReader(csvPath),',');
        String[] line = null;

        while ((line = reader.readNext()) != null){
            UserModel user = new UserModel(line[0],line[1]);
            userModelList.add(user);
        }

        return userModelList;
    }
}
