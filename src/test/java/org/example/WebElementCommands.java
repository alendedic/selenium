package org.example;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Korisnik\\Desktop\\SeleniumProject\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        WebElement theSearchField = driver.findElement(By.id("search_query_top"));
        WebElement theSearchButton = driver.findElement(By.name("submit_search"));
        String stringToSearch = "dress";

        theSearchField.click();
        theSearchField.sendKeys(stringToSearch);
        theSearchButton.click();

        WebElement theSearchPageHeading = driver.findElement(By.cssSelector(".page-heading.product-listing"));

        if (theSearchPageHeading.isDisplayed()){
            System.out.println("This is displayed ");
        }else{
            System.out.println("This is not displayed ");
        }
    }
}
