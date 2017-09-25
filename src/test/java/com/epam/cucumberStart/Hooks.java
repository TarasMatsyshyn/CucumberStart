package com.epam.cucumberStart;

import cucumber.api.java.After;
import utils.ChromeDriverSingleton;

public class Hooks {
    @After
    public void closeDriver(){
        ChromeDriverSingleton.getDriver().close();
    }
}
