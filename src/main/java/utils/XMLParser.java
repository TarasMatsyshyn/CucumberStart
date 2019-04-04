package utils;

import models.UserModel;
import models.Users;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class XMLParser {
    public List<UserModel> unMarshaling(String xmlFilePath) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        Users users = (Users) unmarshaller.unmarshal(new File(xmlFilePath));
        return users.getUserModels();
    }
}
