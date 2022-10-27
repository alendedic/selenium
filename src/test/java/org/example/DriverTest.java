package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class DriverTest {
     public static void main(String[] args) {
        /* System.setProperty("webdriver.chrome.driver","C:\\Users\\Korisnik\\Desktop\\SeleniumProject\\Drivers\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.google.com"); */
        /* System.setProperty("webdriver.gecko.driver","C:\\Users\\Korisnik\\Desktop\\SeleniumProject\\Drivers\\geckodriver.exe");
         WebDriver driver = new FirefoxDriver();*/
         System.setProperty("webdriver.edge.driver","C:\\Users\\Korisnik\\Desktop\\SeleniumProject\\Drivers\\msedgedriver.exe");
         WebDriver driver = new EdgeDriver();
         driver.get("https://www.google.com");
    }
}
