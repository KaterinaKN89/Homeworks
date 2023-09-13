package pages.trello;

import org.openqa.selenium.WebDriver;

import static com.telerikacademy.testframework.Utils.getUIMappingByKey;

public class HomePage extends BaseJiraPage {

    String projectName = getUIMappingByKey("jira.createProject.name");

    public HomePage(WebDriver driver) {
        super(driver, "jira.loginPage");
    }



    public void createProject()  {


        actions.waitForElementClickable("jira.projects.dropDown");
        actions.clickElement("jira.projects.dropDown");

        actions.waitForElementClickable("jira.createProjectButton");
        actions.clickElement("jira.createProjectButton");

        actions.waitForElementClickable("jira.createProject.scrum");
        actions.clickElement("jira.createProject.scrum");

        actions.waitForElementClickable("jira.createProject.scrum.useTemplateButton");
        actions.clickElement("jira.createProject.scrum.useTemplateButton");

        actions.waitForElementClickable("jira.createProject.scrum.teamManagedButton");
        actions.clickElement("jira.createProject.scrum.teamManagedButton");

        actions.waitForElementClickable("jira.createProject.nameInput");
        actions.typeValueInField(projectName, "jira.createProject.nameInput");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        actions.waitForElementClickable("jira.createProject.confirmButton");
        actions.clickElement("jira.createProject.confirmButton");


    }

    public void openCreatedProject() {

        actions.waitForElementClickable("jira.projects.dropDown");
        actions.clickElement("jira.projects.dropDown");

        actions.waitForElementClickable("jira.viewAllProjects");
        actions.clickElement("jira.viewAllProjects");

        actions.waitForElementClickable("jira.openCreatedProject");
        actions.clickElement("jira.openCreatedProject");


    }


}
