package SelLearning;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\I543465\\OneDrive - SAP SE\\Pers\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		
		
		
		Wait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30L))
				.pollingEvery(Duration.ofSeconds(5L))
				;
		
		WebElement content = fluentwait.until(new Function<WebDriver ,WebElement>()
				{
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/h4"));
			}

		

			});
	/*		if(content.isDisplayed())
			{
		System.out.println("1");
			}
			else {
				System.out.println("0");		
				
			}
			
			if(driver.findElement(By.xpath("//*[@id=\"page-footer\"]/div/div/a")).isDisplayed())
			{
		System.out.println("1");
			}
			else {
				System.out.println("0");		
				
			}*/
			System.out.println(content.getText());
			Thread.sleep(10000);
			System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/h4")).getText());
			driver.quit();
	}

}
