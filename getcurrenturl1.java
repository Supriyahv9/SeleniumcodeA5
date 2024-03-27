package BasicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrenturl1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch empty chrome browser
		ChromeDriver driver = new ChromeDriver();
		//To maximize the window
		driver.manage().window().maximize();
		//Launch application
		driver.get("https://www.ajio.com/");
		//Enter perfumes in searchtf
		driver.findElement(By.name("searchVal")).sendKeys("Perfumes");
		//Click on search icon
		driver.findElement(By.className("ic-search")).click();//Perfumes page
		Thread.sleep(2000);
		//To capture the url of current webpage
		String url = driver.getCurrentUrl();
		//To print the current url in the console
		System.out.println(url);
		
	
	
	
	}

}
