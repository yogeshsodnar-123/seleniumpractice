package Seleniumprogramme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcartvalidationbychrome {

	public static void main(String[] args) {
		//set the path of browser
				String driverPath3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";	
				System.setProperty("webdriver.chrome.driver", driverPath3);
				WebDriver driver=new ChromeDriver();
				
          //entered browser url of flipcart
				driver.get("https://www.flipkart.com/");
				String actualTitle=driver.getTitle();
				String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
				System.out.println("title validation:"+actualTitle.equals(expectedTitle));
				
				//expected page url
				String appcurrenturl=driver.getCurrentUrl();
				String expectedurl="https://www.flipkart.com/";
				System.out.println("title validation:"+appcurrenturl.equals(expectedurl));
              
				//webpage source content
				int sourceContent=driver.getPageSource().length();
				System.out.println(" content lenght:"+sourceContent);
				
				//close current browser
				driver.close();
	}

}
