package test.cases.trello;

import static com.telerikacademy.testframework.UserActions.*;

import static com.telerikacademy.testframework.Utils.getUIMappingByKey;
import pages.trello.BoardPage;
import pages.trello.BoardsPage;

import org.junit.Ignore;
import org.junit.Test;

public class BoardTest extends BaseTest {


    @Test
    public void createBoardWhenCreateBoardClicked() {

        login();

        BoardsPage boardsPage = new BoardsPage(actions.getDriver());
        boardsPage.createBoard();


        afterTest();
    }

    @Test
    public void createNewCardInExistingBoardWhenCreateCardClicked() {


        String listName = getUIMappingByKey("trello.firstListName");

        String secondListName = getUIMappingByKey("trello.secondListName");


        beforeTest();

        BoardPage boardPage = new BoardPage(actions.getDriver());

        boardPage.addListToExistingBoard(listName);

        boardPage.addListToExistingBoard(secondListName);

        boardPage.addCardToList();

        boardPage.assertListExists(listName);


        afterTest();


    }


    @Test
    public void moveCardBetweenStatesWhenDragAndDropIsUsed() {


        String listName = getUIMappingByKey("trello.firstListName");

        String secondListName = getUIMappingByKey("trello.secondListName");


        beforeTest();

        BoardPage boardPage = new BoardPage(actions.getDriver());

        boardPage.addListToExistingBoard(listName);

        boardPage.addListToExistingBoard(secondListName);

        boardPage.addCardToList();

        boardPage.moveCardToList();

        afterTest();
    }


    @Test
    public void deleteBoardWhenDeleteButtonIsClicked() {

        beforeTest();

        BoardPage boardPage = new BoardPage(actions.getDriver());

        boardPage.deleteBoard();

        tearDown();

    }

    public void beforeTest() {
        login();

        BoardsPage boardsPage = new BoardsPage(actions.getDriver());
        boardsPage.createBoard();

    }

    public void afterTest () {

        BoardPage boardPage = new BoardPage(actions.getDriver());

        boardPage.deleteBoard();


    }
}
