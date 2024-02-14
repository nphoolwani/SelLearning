package SelLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\I543465\\OneDrive - SAP SE\\Pers\\Selenium\\chromedriver-win64\\chromedriver.exe");  
		    WebDriver driver = new ChromeDriver(); 
		    driver.get("https://jqueryui.com/droppable/");
		    driver.switchTo().frame(0);
		    WebElement SourceElement = driver.findElement(By.id("draggable"));
		    WebElement DestinationElement = driver.findElement(By.id("droppable"));
		    Actions action = new Actions(driver);
		    action.dragAndDrop(SourceElement, DestinationElement).build().perform();
		    
		    
		    


	}

}
