package BasicWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class getpagesource1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch empty chrome browser
				ChromeDriver driver = new ChromeDriver();
				//To maximize the window
				driver.manage().window().maximize();
				//Launch application
				driver.get("https://www.myntra.com/");
				//To capture source code of current webpage
				String sourcecode = driver.getPageSource();
				//To print sourcecode of current webpage in console
				System.out.println(sourcecode);
	
	
	}

}
