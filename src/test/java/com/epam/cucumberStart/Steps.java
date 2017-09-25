package com.epam.cucumberStart;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.GmailLoginPO;
import utils.ChromeDriverSingleton;

public class Steps {

    private GmailLoginPO gmailLoginPO = new GmailLoginPO();

    @Given("^Open '(.*)' in Chrome browser$")
    public void openGmailHomePage(String url){
        ChromeDriverSingleton.getDriver().get(url);
    }

    @When("^I type valid credentials$")
    public void typeCredentials(){
        gmailLoginPO.typeLogin("test.matsyshyn.1@gmail.com");
        gmailLoginPO.typePassword("passwordtest");
    }

    @Then("^User will be able to login successfully$")
    public void openInputMessage(){
        System.out.println("After");
    }
}
