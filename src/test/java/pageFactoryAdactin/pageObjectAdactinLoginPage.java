package pageFactoryAdactin;

import org.junit.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageObjectAdactinLoginPage extends Base {
	public pageObjectAdactinLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement userNametxt;
	@FindBy(id="password")
	private WebElement passWordttxt;
	@FindBy(id="login")
	private WebElement loginbtn;
	
	
	
	public WebElement getUserNametxt() {
		return userNametxt;
	}
	public WebElement getPassWordttxt() {
		return passWordttxt;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	

}


