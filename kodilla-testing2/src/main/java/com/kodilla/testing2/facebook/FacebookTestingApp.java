package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_ACCEPTCOOKIE="//div[contains(@class, \"_9xo5\")]/button[1]";
    public static final String XPATH_OPENREGISTRATION="//a[contains(@class, \"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\")]";
    public static final String XPATH_SELECT_DAY = "//select[contains(@id, \"day\")]";
    public static final String XPATH_SELECT_MONTH = "//select[contains(@id, \"month\")]";
    public static final String XPATH_SELECT_YEAR = "//select[contains(@id, \"year\")]";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

       while(!driver.findElement(By.xpath(XPATH_ACCEPTCOOKIE)).isDisplayed());

        driver.findElement(By.xpath(XPATH_ACCEPTCOOKIE)).click();
        driver.findElement(By.xpath(XPATH_OPENREGISTRATION)).click();

        Thread.sleep(1000L);

        Select selectDayBoard=new Select(driver.findElement(By.xpath(XPATH_SELECT_DAY)));
        selectDayBoard.selectByIndex(10);

        Select selectMonthBoard=new Select(driver.findElement(By.xpath(XPATH_SELECT_MONTH)));
        selectMonthBoard.selectByIndex(1);

        Select selectYearBoard=new Select(driver.findElement(By.xpath(XPATH_SELECT_YEAR)));
        selectYearBoard.selectByValue("1988");
    }
}
