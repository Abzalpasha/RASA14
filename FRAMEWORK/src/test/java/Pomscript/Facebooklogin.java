package Pomscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebooklogin {
@FindBy(id="username")
private WebElement untbox;
@FindBy(id="username")
private WebElement pwdbox;
@FindBy(xpath="//div[.='Login']")
private WebElement loginBtn;
public Facebooklogin(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void username(String un)
{
	untbox.sendKeys(un);
}
	public void password(String pwd)
	{
		pwdbox.sendKeys(pwd);
}

	public void clicklogin()
	{
loginBtn.click();
}}