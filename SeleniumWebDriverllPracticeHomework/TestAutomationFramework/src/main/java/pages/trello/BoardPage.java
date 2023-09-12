package pages.trello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.telerikacademy.testframework.Utils.getUIMappingByKey;

public class BoardPage extends BaseTrelloPage {

    String cardName = getUIMappingByKey("trello.cardName");

    public BoardPage(WebDriver driver) {
        super(driver, "trello.boardPage");
    }



    public void addCardToList() {

//        actions.waitForElementClickable("trello.boardsPage.boardByTeamAndName");
//        actions.clickElement("trello.boardsPage.boardByTeamAndName", "trello.boardName");

        actions.waitForElementClickable("trello.addCard.addCardButton");
        actions.clickElement("trello.addCard.addCardButton");

        actions.waitForElementClickable("trello.addCard.titleInput");
        actions.typeValueInField(cardName, "trello.addCard.titleInput");

        actions.waitForElementClickable("trello.addCard.confirmAddCardButton");
        actions.clickElement("trello.addCard.confirmAddCardButton");

    }

    public void moveCardToList(String cardName, String listName) {
    }

    public void moveCardToList() {

        String cardToMove = getUIMappingByKey("trello.cardToMove");
        String newLocation = getUIMappingByKey("trello.listToMoveTo");

        actions.waitForElementPresent(cardToMove);
        WebElement cardToBeMoved = driver.findElement(By.xpath(cardToMove));
        actions.waitForElementPresent(newLocation);
        WebElement endLocation = driver.findElement(By.xpath(newLocation));

        Actions move = new Actions(driver);
        move.dragAndDrop(cardToBeMoved, endLocation).build().perform();

    }

    public void assertListExists(String listName) {
        actions.waitForElementPresent("trello.boardPage.listByName", listName);
    }

    public void addListToExistingBoard(String listName) {

        actions.waitForElementClickable("trello.addListTitleInput");
        actions.typeValueInField(listName, "trello.addListTitleInput");

        actions.waitForElementClickable("trello.addListConfirmButton");
        actions.clickElement("trello.addListConfirmButton");

    }


    public void deleteBoard() {
        actions.waitForElementClickable("trello.board.menuButton");
        actions.clickElement("trello.board.menuButton");

        actions.waitForElementClickable("trello.board.close");
        actions.clickElement("trello.board.close");

        actions.waitForElementClickable("trello.board.confirmClose");
        actions.clickElement("trello.board.confirmClose");

        actions.waitForElementClickable("trello.board.permanentDelete");
        actions.clickElement("trello.board.permanentDelete");

        actions.waitForElementClickable("trello.board.confirmDelete");
        actions.clickElement("trello.board.confirmDelete");
    }



}
