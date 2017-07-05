package patient.pages;

/**
 * Created by vahanmelikyan on 6/26/17.
 */
public class LoginPage extends _BasePage {

    public void enterEmail() {
        try {
            setProperties(lib);
        } catch (Exception e) {
            e.printStackTrace();
        }
        lib.setText(lib.getProp("fieldEmail"),
                true,
                lib.getProp("email"),
                10);

    }

    public void enterPassword() {
        lib.setText(lib.getProp("fieldPassword"),
                true,
                lib.getProp("password"),
                10);
    }

    public void clickOnLogin(){
        lib.clickElementAndWait(lib.getProp("btnLogin"),
                lib.getProp("loadingScreen"));
    }

    public void login() {
        enterEmail();
        enterPassword();
        clickOnLogin();
    }
}
