package SelLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ListenerMainClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\I543465\\OneDrive - SAP SE\\Pers\\Selenium\\chromedriver-win64\\chromedriver.exe");  
	    WebDriver driver = new ChromeDriver(); 
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    
	    EventCapture eCapture = new EventCapture();
	    //EventFiringDecorator eventhandler = new EventFiringDecorator<ChromeDriver>;
	    WebDriver decorated = new EventFiringDecorator(eCapture).decorate(driver);
	    decorated.get("http://example.com/");
	    WebElement header = decorated.findElement(By.tagName("h1"));
	    String headerText = header.getText();
	    System.out.println(headerText);

	}

}
