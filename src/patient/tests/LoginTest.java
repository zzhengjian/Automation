package patient.tests;

import org.openqa.selenium.WebDriver;
import utilities.DriverManager;
import patient.pages.HomePage;
import patient.pages.LoginPage;
import patient.pages.HealLogin;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends _TestBase {


    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    WebDriver dr = DriverManager.getDriver();

    @Test
    @Parameters({ "url" })
    public void Heal1(String url) throws Exception {
        WebDriver dr = DriverManager.getDriver();

       // lib.browserGoTo(url);
        HealLogin healLogin = new HealLogin(dr);

        healLogin.oUserNameInput.sendKeys("mayur+qatest@heal.com");
        healLogin.oPasswordInput.sendKeys("Heal4325");
        healLogin.oLoginBtn.click();
//        healLogin.Login();



           // HealLogin.LoginSF();
//            loginPage.login();
//            homePage.home();
//            homePage.bookVisit();
//            homePage.visits();
//            homePage.profiles();
//            homePage.paymentMethods();
//            homePage.signOut();

            // Thread.sleep(5000);
    }
}