package automationtesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DragDropassign {

	WebDriver driver;
	public void dragsdrop()
	{

		driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Actions/index.html ");
		driver.manage().window().maximize();
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(drag).click();
		actions.doubleClick(drag).perform();
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		actions.dragAndDrop(drag, drop).build().perform();
		WebElement doubleclick=driver.findElement(By.xpath("//div[@id='double-click']"));
		actions.doubleClick(doubleclick).perform();
		WebElement hold=driver.findElement(By.xpath("//div[@id='click-box']"));
		hold.click();
		
	}
	

			
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DragDropassign dragdrops=new DragDropassign();
		dragdrops.dragsdrop();
	}

}
