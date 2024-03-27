package BasicWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch2 {

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
				driver.findElement(By.className("ic-search")).click();//Watches page
				//Click on selected watch image
		driver.findElement(By.cssSelector("img[alt='Product image of Skylona skm 9180 Analogue Watch with Deployant Clasp ']")).click();
				Thread.sleep(2000);
				
				//To transfer the driver control from parent window to child window
				//Step1:How many window/tab are there
				Set<String> ids = driver.getWindowHandles();
				System.out.println(ids);
				
				//Step2:for-each loop when we have multiple windows/tab
				for(String e:ids) {
					//System.out.println(e);
					/*String url = driver.getCurrentUrl();
					System.out.println(url);*/
					String allurl = driver.switchTo().window(e).getCurrentUrl();
					System.out.println(allurl);
					
					String childurl = "https://www.ajio.com/skylona-skm-9180-analogue-watch-with-deployant-clasp-/p/466296274_black";
					
					if(allurl.contains(childurl)) {
						break;
					}
				}
				
			
				//Click on add to bag button
				driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
				
				Thread.sleep(4000);
				
				
	//To transfer the driver control from child window to parent window			
			for(String r:ids) {
				String urls = driver.switchTo().window(r).getCurrentUrl();
			System.out.println(urls);
			
			String parenturl = "https://www.ajio.com/s/watches-3991-60341?query=:relevance&classifier=intent";
			
			
			if(urls.contains(parenturl)) {
				break;
			}
			}
				
	
				//Click on Men
			driver.findElement(By.xpath("//label[contains(text(),'Women')]")).click();	
			
	}

}
