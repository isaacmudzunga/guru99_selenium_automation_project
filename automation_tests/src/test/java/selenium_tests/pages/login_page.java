package selenium_tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import selenium_tests.base;

public class login_page {
    private final WebDriver driver;
    private final WebDriverWait wait;

    public login_page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void open_site() {
        driver.get(base.getUrl());
    }

    public boolean page_header(String header) {
        WebElement pageHeader = driver.findElement(By.xpath("/html/body/div[2]/h2"));
        return pageHeader.isDisplayed();
    }

    public void fill_form(String userid, String password) {
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys(userid);
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys(password);
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
    }

}
