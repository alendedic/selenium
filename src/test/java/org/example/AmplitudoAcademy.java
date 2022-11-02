package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmplitudoAcademy {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Korisnik\\Desktop\\SeleniumProject\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://akademija.amplitudo.me/");

        String title = driver.getTitle();
        int length = driver.getTitle().length();
        System.out.println(title);
        System.out.println("Length is "+ length);

        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("https")){
            System.out.println("Url is secure ");
        } else {
            System.out.println("Url is not secure ");
        };
        String pageSource = driver.getPageSource();
        int lengthSource = driver.getPageSource().length();
        System.out.println("Length is "+ lengthSource);
        driver.close();
    }
}
