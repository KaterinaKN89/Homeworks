package pages.trello;

import org.openqa.selenium.WebDriver;

import static com.telerikacademy.testframework.Utils.getUIMappingByKey;

public class ProjectPage extends BaseJiraPage {

    public ProjectPage(WebDriver driver) {super(driver, "jira.loginPage");
    }

    public String storySummary = getUIMappingByKey("jira.createStory.summary");
    public String storyDescription = getUIMappingByKey("jira.createStory.description");
    public String bugSummary = getUIMappingByKey("jira.createBug.summary");

    public String bugDescription = "Description\n" +
            "As a user I want to be able to navigate the site and open the different sections in order to gather more information and/or book a tour/flight\n" +
            "Steps to reproduce\n" +
            "1.Navigate to https://phptravels.net/ru\n" +
            "2.Scroll down to the bottom of the page\n" +
            "3.Select 'How to Book' in the Corporate section\n" +
            "Expected result\n" +
            "Information on how to make an actual booking to be displayed\n" +
            "The url to be changed to https://phptravels.net/How-To-Book\n" +
            "Actual result\n" +
            "The search dialogue box displays and an advertise to download the mobile app is shown\n" +
            "The url is changed to https://phptravels.net/How-To-Book";

    public void createStoryInExistingProject()  {


        actions.waitForElementClickable("jira.createIssue.button");
        actions.clickElement("jira.createIssue.button");

        actions.waitForElementClickable("jira.createIssue.summaryInput");
        actions.typeValueInField(storySummary, "jira.createIssue.summaryInput");

        actions.waitForElementClickable("jira.createIssue.descriptionInput");
        actions.typeValueInField(storyDescription, "jira.createIssue.descriptionInput");

        actions.waitForElementClickable("jira.createIssue.confirmCreate");
        actions.clickElement("jira.createIssue.confirmCreate");

        actions.waitForElementClickable("jira.createIssue.viewIssueButton");
        actions.clickElement("jira.createIssue.viewIssueButton");

    }

    public void createBugInExistingProject()  {


        actions.waitForElementClickable("jira.createIssue.button");
        actions.clickElement("jira.createIssue.button");

        actions.waitForElementClickable("jira.createIssue.summaryInput");
        actions.typeValueInField(bugSummary, "jira.createIssue.summaryInput");

        actions.waitForElementClickable("jira.createIssue.descriptionInput");
        actions.typeValueInField(bugDescription, "jira.createIssue.descriptionInput");

        actions.waitForElementClickable("jira.createIssue.confirmCreate");
        actions.clickElement("jira.createIssue.confirmCreate");

        actions.waitForElementClickable("jira.createIssue.viewIssueButton");
        actions.clickElement("jira.createIssue.viewIssueButton");

        actions.waitForElementClickable("jira.changeIssueTypeButton");
        actions.clickElement("jira.changeIssueTypeButton");

        actions.waitForElementClickable("jira.changeIssueType.bug");
        actions.clickElement("jira.changeIssueType.bug");


    }

}
