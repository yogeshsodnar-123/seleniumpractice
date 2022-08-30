package Seleniumprogramme;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Openfirfoxbrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"D:\\workspace\\SeleniumBasic\\Executables\\geckodriver.exe");
		FirefoxDriver fdriver = new FirefoxDriver();
		fdriver.get("https://www.google.com");
		//fdriver.close();
	}

	}


