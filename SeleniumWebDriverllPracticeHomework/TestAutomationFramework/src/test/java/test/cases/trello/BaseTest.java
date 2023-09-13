package test.cases.trello;

import pages.trello.LoginPage;

import com.telerikacademy.testframework.UserActions;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class BaseTest {

    UserActions actions = new UserActions();

    @BeforeClass
    public static void setUp() {

        UserActions.loadBrowser("jira.loginPage");

    }

    @AfterClass
    public static void tearDown() {

        UserActions.quitDriver();
    }

    public void login() {

        LoginPage loginPage = new LoginPage(actions.getDriver());
        loginPage.loginUser("user");
    }

    public void logout() {
        actions.waitForElementClickable("trello.header.member.menuButton");
        actions.clickElement("trello.header.member.menuButton");

        actions.waitForElementClickable("trello.logOutButton");
        actions.clickElement("trello.logOutButton");
    }


}
