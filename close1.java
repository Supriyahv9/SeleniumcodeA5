package BasicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class close1 {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.className("ic-search")).click();//watch page
		Thread.sleep(2000);
		//Click on selected watch image
driver.findElement(By.cssSelector("img[alt='Product image of French Connection Men Water-Resistant Analogue Watch-FCP41SM']")).click();
		
Thread.sleep(2000);
driver.quit();
		
		
	}

}
