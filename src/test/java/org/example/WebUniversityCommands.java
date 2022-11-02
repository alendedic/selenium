package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebUniversityCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Korisnik\\Desktop\\SeleniumProject\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
        WebElement theFirstNameField = driver.findElement(By.name("first_name"));
        WebElement theLastNameField = driver.findElement(By.name("last_name"));
        WebElement theEmailField = driver.findElement(By.name("email"));
        WebElement theCommentsField = driver.findElement(By.name("message"));
        WebElement theResetButton = driver.findElement(By.cssSelector("[type='reset']"));
        WebElement theSubmitButton = driver.findElement(By.cssSelector("[type='submit']"));


        theFirstNameField.click();
        theFirstNameField.sendKeys("Alen");
        theLastNameField.click();
        theLastNameField.sendKeys("Dedić");
        theEmailField.click();
        theEmailField.sendKeys("alen.dedic@amplitudo.me");
        theCommentsField.click();
        theCommentsField.sendKeys("Example description");
        theResetButton.click();
        theFirstNameField.click();
        theFirstNameField.sendKeys("Alen");
        theLastNameField.click();
        theLastNameField.sendKeys("Dedić");
        theEmailField.click();
        theEmailField.sendKeys("alen.dedic@amplitudo.me");
        theCommentsField.click();
        theCommentsField.sendKeys("Example description");
        theSubmitButton.click();

        WebElement theSuccessMessage = driver.findElement(By.cssSelector("#contact_reply h1"));
        if (theSuccessMessage.getText().equalsIgnoreCase("Thank you for your message!")){
            System.out.println("This is success");
        }else {
            System.out.println("This is not success");
        }
    }
}
