package patient.pages;

import com.heal.framework.web.HealWebElement;
import com.heal.framework.web.WebBase;

import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

/**
 * Created by vahanmelikyan on 7/5/17.
 */
public class HealLogin extends WebBase{

    public static final String URL = "https://patient.qa.heal.com/login";
///////////////////
// Page Elements //
///////////////////
    public HealWebElement oUserNameInput = new HealWebElement("oUserNameInput", "xpath=//input[@name='username']",oWebDriver);
    public HealWebElement oPasswordInput = new HealWebElement("oPasswordInput", "xpath=//input[@name='password']", oWebDriver);
    public HealWebElement oLoginBtn = new HealWebElement("oLoginBtn", "xpath=//*[text()='Log In']", oWebDriver);
    public HealWebElement oRememberUserNameLabel = new HealWebElement("oRememberUserNameLabel", "id=rememberUn", oWebDriver);
    public HealWebElement oForgotYourPasswordLnk = new HealWebElement("oForgotYourPasswordLnk", "xpath=//div[@id='forgot']/span/a", oWebDriver);
    public HealWebElement oWarningMsg = new HealWebElement("oWarningMsg","id=error",oWebDriver);
//////////////////
// Constructors //
//////////////////
    public HealLogin(WebDriver oTargetDriver)
    {
        super(oTargetDriver, URL);
    }
    public HealLogin(WebDriver oTargetDriver, String sUrl)
    {
        super(oTargetDriver, sUrl);
    }
/////////////
// Methods //
/////////////
    public void Login()
    {
        this.oUserNameInput.sendKeys("mayur+qatest@heal.com");
        this.oPasswordInput.sendKeys("Heal4325");
        this.oLoginBtn.click();
    }

}
