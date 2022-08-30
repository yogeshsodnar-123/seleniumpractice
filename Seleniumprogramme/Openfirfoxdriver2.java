package Seleniumprogramme;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Openfirfoxdriver2 {

	public static void main(String[] args) {
		String currentworkingDir=System.getProperty("user.dir");
		System.out.println("current working dir:"+currentworkingDir);
		String chromeExepath=currentworkingDir+"\\Executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",chromeExepath);
		
		FirefoxDriver fdriver1 = new FirefoxDriver();
		fdriver1.get("https://www.google.com");
		//fdriver.close();
	}

	}


