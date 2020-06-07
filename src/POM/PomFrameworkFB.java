package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.AutoConstant;
import Generics.BasePage;
import Generics.ExcelLibrary;

public class PomFrameworkFB extends BasePage implements AutoConstant
{

	@FindBy(xpath="//input[@name='firstname']")
	private WebElement Firsttextfield;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement LastnameTextField;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement EmailidTextfield;
	
	@FindBy(xpath="//input[@name='reg_passwd__']")
	private WebElement PasswordtextField;
	
	@FindBy(id="u_0_a")
	private WebElement SexMalebutton;

public PomFrameworkFB(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void enterdetails() throws IOException
{
	Firsttextfield.sendKeys(ExcelLibrary.getCellValue(Excelpath,Sheetname,2,0));
//	LastnameTextField.sendKeys(ExcelLibrary.getCellValue(Excelpath, Sheetname, 2, 1));
//	EmailidTextfield.sendKeys(ExcelLibrary.getCellValue(Excelpath, Sheetname, 2, 2));
}

}


