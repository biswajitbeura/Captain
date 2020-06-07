package TEST;

import java.io.IOException;
import org.testng.annotations.Test;
import Generics.BaseTest;
import POM.PomFrameworkFB;

public class TESTFramework  extends BaseTest
{

	//private WebDriver driver;

	@Test
	public void submit() throws IOException
	{
		PomFrameworkFB PF= new PomFrameworkFB(driver);
		PF.enterdetails();
	}
}
