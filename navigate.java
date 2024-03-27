package BasicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch empty chrome browser
				ChromeDriver driver = new ChromeDriver();
				//To maximize the window
				driver.manage().window().maximize();
				//Launch application
				driver.navigate().to("https://www.ajio.com/s/perfumes-4405-57701?query=:relevance&classifier=intent");
				
	}

}
