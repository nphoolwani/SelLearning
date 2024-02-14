package SelLearning;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\I543465\\OneDrive - SAP SE\\Pers\\Selenium\\chromedriver-win64\\chromedriver.exe");  
		    WebDriver driver = new ChromeDriver(); 
		    driver.get("https://www.fnp.com/");
		    driver.manage().window().maximize();
		    Thread.sleep(6000);
		   // Alert a1 = driver.switchTo().alert();
		    //a1.dismiss();
		    Robot robot = new Robot();
		    robot.mouseMove(440, 80);
		    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		    Thread.sleep(2000);
		    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		    Thread.sleep(2000);
		    robot.mouseMove(980, 280);
		    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		    Thread.sleep(2000);
		    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		    Thread.sleep(2000);
		    
		    Actions builder = new Actions(driver);
		    builder.moveToElement(driver.findElement(By.id("#rakhimenu"))).build().perform();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[@id=\"rakhimenu\"]/div/section[1]/ul/li[1]/a")).click();
		//  builder.moveToElement(link).build().perform();
		    Thread.sleep(2000);
		    
		    WebElement act = driver.findElement(By.id("header-search-input"));
		   // builder.moveToElement(act).build().perform();
		    Thread.sleep(3000);
		    WebElement search = driver.findElement(By.xpath("//*[text()='search']"));
		  //  builder.moveToElement(search).build().perform();
		    Thread.sleep(3000);
		    org.openqa.selenium.interactions.Action seriesOfActions;
		    seriesOfActions = builder
		    		.sendKeys(act,"Floral Rakhi")
		    		.keyDown(search,Keys.SHIFT)
		    		.keyUp(search, Keys.SHIFT)
		    		.build();
		    seriesOfActions.perform();
		    		
		    
		    
		    //driver.quit();
		    
		    

	}

}
