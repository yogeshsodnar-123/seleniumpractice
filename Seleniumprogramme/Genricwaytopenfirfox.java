package Seleniumprogramme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Genricwaytopenfirfox {

	public static void main(String[] args) {
		String currentworkingDir=System.getProperty("user.dir");
		System.out.println("current working dir:"+currentworkingDir);
		String chromeExepath=currentworkingDir+"\\Executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",chromeExepath);
		
		//FirefoxDriver fdriver1 = new FirefoxDriver();
		WebDriver fdriver = new FirefoxDriver();
		fdriver.get("https://www.google.com");
		//fdriver.close();

	}

}
