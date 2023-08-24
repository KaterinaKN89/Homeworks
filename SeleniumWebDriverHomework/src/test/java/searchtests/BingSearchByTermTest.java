package searchtests;

import basetest.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BingSearchByTermTest extends BaseTest {

    @Test
    public void resultFoundWhenSearchTermProvided_telerikAcademyAlpha() {
        // Navigate to Bing.com
        driver.get("https://bing.com");

        // Agree to consent
        WebElement agreeButton = driver.findElement(By.xpath("//button[@id='bnp_btn_accept']"));
        agreeButton.click();

        // Type text in search field
        WebElement searchField = driver.findElement(By.xpath("//input[@id='sb_form_q']"));
        searchField.sendKeys(searchTerm);

        //Submit the form
        searchField.submit();

        // Assert result found
        WebElement firstResult = driver.findElement(By.xpath("//h2[@class=' b_topTitle']"));
        Assertions.assertTrue(firstResult.getText().contains(searchTerm), "Search result not found");
    }
}

