package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	
	
	public void Web() {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.apple.in/");
		
		driver.findElement(By.linkText("Laptop")).click();
		
		driver.findElement(By.partialLinkText("edge 40 neo")).click();
		
		
	
		
	}
	
	
	

}
