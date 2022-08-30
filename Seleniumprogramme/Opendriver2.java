package Seleniumprogramme;

import org.openqa.selenium.chrome.ChromeDriver;

public class Opendriver2 {

	public static void main(String[] args) {
		/**
		 * Step1: set the path of required browser executable file using System.setProperty(key, value)
		 * Step2: create an instance of required browser class
		 */
		String currentworkingDir=System.getProperty("user.dir");
		System.out.println("current working dir:"+currentworkingDir);
		String chromeExepath=currentworkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromeExepath);
		
		ChromeDriver cdriver=new  ChromeDriver();
		//to enter the url on the open browser
		cdriver.get("https://www.google.com");
		//close the current browser
		cdriver.close();
	}




	}


