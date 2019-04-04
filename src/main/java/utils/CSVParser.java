package utils;

import com.opencsv.CSVReader;
import model.UserModel;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVParser {

    public static List<UserModel> getUsersFromCSV(String csvPath) throws IOException {
        List<UserModel> userModelList = new ArrayList<>();
        CSVReader reader = new CSVReader(new FileReader("src/test/resources/com/epam/dataProvider/users.csv"),',');
        String[] line = null;

        while ((line = reader.readNext()) != null){
            UserModel user = new UserModel(line[0],line[1]);
            userModelList.add(user);
        }

        return userModelList;
    }

    public static void main(String[] args) throws IOException {
        ArrayList <UserModel> list = (ArrayList) getUsersFromCSV("src/test/resources/com/epam/dataProvider/users.csv");
        list.forEach(e->{
            System.out.println(e.getLogin());
            System.out.println(e.getPassword());
        });
    }

}
