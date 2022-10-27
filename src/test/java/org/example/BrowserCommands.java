package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Korisnik\\Desktop\\SeleniumProject\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.amplitudo.me";
        driver.get(url);
        driver.get("https://www.amplitudo.me");
        String title = driver.getTitle();
        //String pageSource = driver.getPageSource();
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Title is " + title);
       // System.out.println("Page source is " + pageSource);
        System.out.println("Current URL is " + currentUrl);
        if (url.equals(currentUrl)) {
            System.out.println("Url is okey");
        } else {
            System.out.println("Url is not okey");
        }
        driver.navigate().to("https://google.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.close();
    }
}
