package test.cases.trello;

import static com.telerikacademy.testframework.Utils.getUIMappingByKey;
import pages.trello.HomePage;
import pages.trello.ProjectPage;

import org.junit.Test;

public class JiraTest extends BaseTest {



    // HI THERE! :)  PLEASE HAVE IN MIND THAT THE TESTS WORK ONLY SEPARATELY.
    // AND I KNOW IT IS NOT FINISHED, BUT UNFORTUNATELY DIDN'T HAVE TIME FOR MORE.


    @Test
    public void createAProject() {

        login();

        HomePage homePage = new HomePage(actions.getDriver());

        homePage.createProject();



    }

    @Test
    public void createAStory() {

        login();

        HomePage homePage = new HomePage(actions.getDriver());
        homePage.openCreatedProject();

        ProjectPage projectPage = new ProjectPage(actions.getDriver());
        projectPage.createStoryInExistingProject();


    }

    @Test
    public void createABug() {

        login();

        HomePage homePage = new HomePage(actions.getDriver());
        homePage.openCreatedProject();

        ProjectPage projectPage = new ProjectPage(actions.getDriver());
        projectPage.createBugInExistingProject();



    }







}
