package Zone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://zone.tandemloop.net/auth/login");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("vibhutimathshantayya@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Shantu@1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		//driver.quit();
		
		
	}
}
