package hfirst.hef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleLaunchingApp {
	
	@Test
	public void tc_001()
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Cucumber\\Selenium jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://maven.apache.org/surefire/maven-surefire-plugin/examples/testng.html");
	}

}
