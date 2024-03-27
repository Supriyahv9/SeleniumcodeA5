package BasicWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwindowhandle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch empty chrome browser
				ChromeDriver driver = new ChromeDriver();
				//To maximize the window
				driver.manage().window().maximize();
				//Launch application
				driver.get("https://www.ajio.com/");
				//Enter Watches in searchtf
				driver.findElement(By.name("searchVal")).sendKeys("Watches");
				//Click on search icon
				driver.findElement(By.className("ic-search")).click();//Perfumes page
				
driver.findElement(By.cssSelector("img[alt='Product image of French Connection Men Water-Resistant Analogue Watch-FCP41SM']")).click();
				
				
				
				
				//To capture id of current window
				  String id = driver.getWindowHandle();
				//To print id of current window in the console
				System.out.println(id);
	
	
	
	
	
	
	}

}
