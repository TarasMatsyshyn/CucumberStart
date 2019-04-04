package com.epam.dataProvider;

import models.UserModel;
import org.testng.ITestContext;
import utils.CSVParser;
import utils.XLSParser;
import utils.XMLParser;

import java.io.IOException;
import java.util.List;

public class DataProvider {

    @org.testng.annotations.DataProvider(parallel = true)
    public static Object[][] getData(ITestContext context) throws Exception {
        List<UserModel> users = userModelsCSV(context.getCurrentXmlTest().getParameter("datafile"));
        Object[][] data = new Object[users.size()][2];

        for (int i = 0; i < users.size(); i++) {
            data[i][0] = users.get(i).getLogin();
            data[i][1] = users.get(i).getPassword();
        }
        return data;
    }

    private static List<UserModel> userModelsXML(String xmlFilePath) throws Exception {
        XMLParser xmlParser = new XMLParser();
        return xmlParser.unMarshaling(xmlFilePath);
    }

    private static List<UserModel> userModelsCSV(String csvPath) throws IOException {
        CSVParser csvParser = new CSVParser();
        return csvParser.getUsersFromCSV(csvPath);
    }

    private static List<UserModel> userModelXLS(String xlsxPath) throws IOException {
        XLSParser xlsParser = new XLSParser();
        return xlsParser.getUsersFromXLS(xlsxPath);
    }
}
