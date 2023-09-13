package pages.trello;

import org.openqa.selenium.WebDriver;

import static com.telerikacademy.testframework.Utils.getConfigPropertyByKey;

public class LoginPage extends BaseJiraPage {

    public static String boardId = null;

    public LoginPage(WebDriver driver) {
        super(driver, "jira.loginPage");
    }

    public void loginUser(String userKey) {
        String username = getConfigPropertyByKey("jira.users." + userKey + ".username");
        String password = getConfigPropertyByKey("jira.users." + userKey + ".password");

        navigateToPage();
        assertPageNavigated();

        actions.waitForElementVisible("jira.loginPage.username");
        actions.typeValueInField(username, "jira.loginPage.username");

        actions.waitForElementVisible("jira.loginPage.EmailLoginButton");
        actions.clickElement("jira.loginPage.EmailLoginButton");

        actions.waitForElementVisible("jira.loginPage.password");
        actions.typeValueInField(password, "jira.loginPage.password");

        actions.waitForElementVisible("jira.loginPage.loginSubmitButton");
        actions.clickElement("jira.loginPage.loginSubmitButton");

   //     actions.waitForElementVisible("trello.header.member.menuButton");
    }
}
