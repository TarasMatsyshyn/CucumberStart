package com.epam.dataProvider.cucumberTask;

import cucumber.api.java.After;
import utils.ChromeDriverSingleton;

public class Hooks {
    @After
    public void closeDriver(){
        ChromeDriverSingleton.getDriver().close();
    }
}
