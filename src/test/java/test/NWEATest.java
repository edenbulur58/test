package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NWEATest {

    @Test
    public  void loginMethod(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://sso.mapnwea.org/auth/login?dest=https%3A%2F%2Fteach.mapnwea.org%2Fadmin%2F");

        WebElement username=driver.findElement(By.id("username"));
        WebElement password=driver.findElement(By.id("password"));

        username.sendKeys("username");
        password.sendKeys("password");



}
}
