package Login;

import net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class LoginTests {

    private WebDriver driver;
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.kobo360.com/");
        Thread.sleep(5000);

        //1. maximize the window
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        driver.findElement(By.id("email")).sendKeys("joyekong1232Ggmail.com");
        driver.findElement(By.id("pass")).sendKeys("081355145");
        driver.findElement(By.id("loginbutton")).click();

    }
    public static void main(String args[]) throws InterruptedException {
        LoginTests test = new LoginTests();
        test .setUp();


    }
}
