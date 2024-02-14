package SelLearning;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;  

public class CSS_Selector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\I543465\\OneDrive - SAP SE\\Pers\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("iPhone 14");
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector(".nav-input nav-progressive-attribute")).click();
		driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
		js.executeScript("window.scrollBy(0,300)");
		
		//String s = driver.findElement(By.cssSelector(".a-price-whole")).getText();
		
		//String s = driver.findElement(By.cssSelector("span[class*='price-whole']")).getText();
		//String s = driver.findElement(By.cssSelector("span[class^='a-price']")).getText();
		String s = driver.findElement(By.cssSelector("span[class$='whole']")).getText();
		System.out.print(s);
		
	}

}
