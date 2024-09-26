package Zone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google_Click {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("https://www.google.com/");
    
   WebElement ele=driver.findElement(By.xpath("//*[name()='svg' and @class='gb_E']"));
   Actions act = new Actions(driver);
   act.moveToElement(ele).click().perform();
   
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@style='background-position: 0 -406px;']")).click();
	}

}
