package pageObjectClass;

import org.junit.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PagesObjectFaceBookLogin extends Base {
	public PagesObjectFaceBookLogin() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement usernametxt;
	@FindBy(id="pass")
	private WebElement passwordttxt;
	@FindBy(name="login")
	private WebElement loginbtn;
	@FindBy(xpath="//h2[contains(text(),'Facebook help')]")
	private WebElement facebootext;
	
	public WebElement getFacebootext() {
		return facebootext;
	}
	public WebElement getUsernametxt() {
		return usernametxt;
	}
	public WebElement getPasswordttxt() {
		return passwordttxt;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}

}
