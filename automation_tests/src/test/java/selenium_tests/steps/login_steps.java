package selenium_tests.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;

import selenium_tests.base;
import selenium_tests.pages.login_page;

public class login_steps {
    private final WebDriver driver;
    private final login_page login;

    public login_steps() {
        driver = base.getDriver();
        login = new login_page(driver);
    }

    @Given("I am on the Guru99 Bank login page")
    public void open_website(){
        login.open_site();
    }

    @When("the site opens, the page title should be {string}")
    public void verify_pagetitle(String expectedTitle) {
        assertEquals(expectedTitle, driver.getTitle());
    }

    @And("the current URL should be {string}")
    public void verify_current_url(String expectedUrl) {
        assertEquals(expectedUrl, driver.getCurrentUrl());
    }

    @Then("the site header should be {string}")
    public void verify_header(String header) {
        assertTrue(login.page_header(header));
    }

    @When("I enter valid userid {string} and password {string} and login")
    public void login_process(String userId, String password) {
        login.fill_form(userId, password);
    }

    

}
