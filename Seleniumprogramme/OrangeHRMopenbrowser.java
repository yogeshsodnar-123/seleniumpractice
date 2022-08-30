package Seleniumprogramme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMopenbrowser {

	public static void main(String[] args) {
		//set the path of browser
				String driverPath3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";	
				System.setProperty("webdriver.chrome.driver", driverPath3);
				WebDriver driver=new ChromeDriver();

				
		        //entered browser url of amazon
						driver.get("https://www.orangehrm.com/");
						
						//page title
						String pageTitle=driver.getTitle();
						System.out.println("page title is:"+pageTitle.length());
						System.out.println("title validation:"+pageTitle.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM"));
						
						String pageurl=driver.getCurrentUrl();
						System.out.println("page title is:"+pageurl);
						String expectedurl="https://www.orangehrm.com/";
						System.out.println("url validation:"+pageurl.contains(expectedurl));
						
						//webpage source content
						String pageSource=driver.getPageSource();
						System.out.println("page source length is:"+ pageSource.length());
						
						//close current browser
						//driver.close();


	}

}
