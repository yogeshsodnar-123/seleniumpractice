package Seleniumprogramme;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipcartvalidationbyFirfox {

	public static void main(String[] args) {
		//set the path of browser
		String driverPath3=System.getProperty("user.dir")+"\\executables\\geckodriver.exe";	
		System.setProperty("webdriver.gecko.driver", driverPath3);
	     WebDriver driver=new FirefoxDriver();
		     
		
        //entered browser url of flipcart
				driver.get("https://www.flipkart.com/");
				String actualTitle=driver.getTitle();
				String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
				System.out.println("title validation:"+actualTitle.equals(expectedTitle));
				
		//webpage source content
		int sourceContent=driver.getPageSource().length();
		System.out.println(" content lenght:"+sourceContent);
		
		//close current browser
		//driver.close();

	}

}
