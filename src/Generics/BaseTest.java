package Generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConstant
{
	public WebDriver driver;
	
	@BeforeClass
	public void openbrowser()
	{
		System.setProperty(chrome, chrome_value);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(URL);
	}
	
	@BeforeMethod
	public void startExecution()
	{
		Reporter.log("Execution is going to Start");
	}
	
}
