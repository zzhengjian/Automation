package patient.tests;

import patient.pages.HomePage;
import patient.pages.LoginPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends _TestBase {


    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();


    @Test
    @Parameters({ "url" })
    public void Heal1(String url) throws Exception {
            lib.browserGoTo(url);

            loginPage.login();
            homePage.home();
            homePage.bookVisit();
            homePage.visits();
            homePage.profiles();
            homePage.paymentMethods();
            homePage.signOut();

            // Thread.sleep(5000);
    }
}