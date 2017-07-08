package patient.tests;

import com.heal.framework.web.HealWebElement;
import com.heal.framework.web.WebBase;
import org.openqa.selenium.WebDriver;
import patient.pages.LoginPage;
import patient.pages.Menu;
import utilities.DriverManager;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends WebBase {

    WebDriver dr = DriverManager.getDriver();

    @Test
    @Parameters({ "url" })
    public void loginWithValidCredentials(String url) throws Exception {

        WebDriver dr = DriverManager.getDriver();

       // lib.browserGoTo(url);
        LoginPage loginPage = new LoginPage(dr, url);
        Menu menu = new Menu(dr);

        HealWebElement.setbMonitorMode(true);
        loginPage.oUserNameInput.sendKeys("mayur+qatest@heal.com");
        loginPage.oPasswordInput.sendKeys("Heal4325");

       // loginPage.oRememberMe.click(1,1);

        //loginPage.oRegisterBtn.click();
        Thread.sleep(4000);
        loginPage.oLoginBtn.click();
//        menu.SelectFromMenu(menu.oHomeLnk);
//        menu.SelectFromMenu(menu.oBookVisitLnk);
//        menu.SelectFromMenu(menu.oVisitsLnk);
//        menu.SelectFromMenu(menu.oProfilesLnk);
//        menu.SelectFromMenu(menu.oPamentMethodLnk);
//        menu.SelectFromMenu(menu.oSignOutLnk);
        Thread.sleep(4000);
//        loginPage.LoginPage();



           // LoginPage.LoginSF();
//            loginPage.loginPage();
//            homePage.home();
//            homePage.bookVisit();
//            homePage.visits();
//            homePage.profiles();
//            homePage.paymentMethods();
//            homePage.signOut();

            // Thread.sleep(5000);
    }
}