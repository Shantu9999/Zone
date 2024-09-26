package Zone;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signup {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://zone.tandemloop.net/auth/login");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Sign up")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@placeholder=\"Enter your first name\"]")).sendKeys("Shantayya");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@placeholder=\"Enter your last name\"]")).sendKeys("Vibhutimath");
    Thread.sleep(2000);
    driver.findElement(By.id("email")).sendKeys("vibhutimathshantayya@gmail.com");
    Thread.sleep(2000);
    driver.findElement(By.id("password")).sendKeys("Shantu@1234");
    Thread.sleep(2000);
    driver.findElement(By.id("check-password")).sendKeys("Shantu@1234");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()=\" Get started \"]")).click();
    Thread.sleep(2000);
    driver.quit();
    driver.findElement(By.xpath("//span[text()=\" Back to log in \"] ")).click();
   // Thread.sleep(2000);
    driver.quit();
	}

}
