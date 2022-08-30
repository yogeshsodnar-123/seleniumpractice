package Seleniumprogramme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openchrome3 {

	public static void main(String[] args) {
		String currentworkingDir=System.getProperty("user.dir");
		System.out.println("current working dir:"+currentworkingDir);
		String chromeExepath=currentworkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromeExepath);
		WebDriver driver = new  ChromeDriver();
		
		//need to enter application URL in the opened browser
		driver.get("https://www.google.com");
		
		//expected page url
		String expectedUrl="https://www.google.com/";
		//get the entered URL from the opened browser
		String appCurrentUrl=driver.getCurrentUrl();				
		//System.out.println("Actaul URL:"+appCurrentUrl);
		//System.out.println("Expected URL: "+expectedUrl);
		if(appCurrentUrl.contains(expectedUrl)) {
			System.out.println("Current URL validation is passed");
		}else {
			System.out.println("Current URL validation is Failed");
		}
		
		//verify that Google search page is opened or not using title
		String actualTitle=driver.getTitle();
		String expectedTitle="Google";
		System.out.println("ActualTitle:"+actualTitle);
		System.out.println("ExpectedTitle: "+expectedTitle);
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Title validation is passed");
		}else {
			System.out.println("Title validation is Failed");
		}
		//get the webpage source content
		String sourceContent=driver.getPageSource();
		System.out.println("Source content lenght:"+sourceContent.length());
		//close current browser
		//driver.close();
	}

}
