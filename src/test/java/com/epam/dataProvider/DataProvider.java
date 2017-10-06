package com.epam.dataProvider;

import model.UserModel;
import utils.UserCredentionalXMLParser;

import java.util.List;

public class DataProvider {

    @org.testng.annotations.DataProvider(parallel = true)
    public Object [][] getData() throws Exception {
        List<UserModel> users = userModels();
        Object [][] data = new Object[users.size()][2];

        for(int i = 0; i < users.size(); i++){
            data[i][0] = users.get(i).getLogin();
            data[i][1] = users.get(i).getPassword();
        }
        return data;
    }

    private List<UserModel> userModels() throws Exception{
        UserCredentionalXMLParser xmlParser = new UserCredentionalXMLParser();
        return xmlParser.unMarshaling();
    }
}
