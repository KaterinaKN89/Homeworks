package searchtests;

import basetest.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleSearchByTermTest extends BaseTest {

    @Test
    public void resultFoundWhenSearchTermProvided_telerikAcademyAlpha() {
        // Navigate to Google.com
        driver.get("https://google.com");

        // Agree to consent
        WebElement agreeButton = driver.findElement(By.xpath("//button[@id='L2AGLb']"));
        agreeButton.click();

        // Type text in search field
        WebElement searchField = driver.findElement(By.xpath("//textarea[@type='search']"));
        searchField.sendKeys(searchTerm);

        // Click Search button
        WebElement searchButton = driver.findElement(By.xpath("(//input[@type='submit' and @name='btnK'])[2]"));
        searchButton.click();

        // Assert result found
        WebElement firstResult = driver.findElement(By.xpath("(//a/h3)[1]"));
        Assertions.assertTrue(firstResult.getText().contains(searchTerm), "Search result not found");
    }
}