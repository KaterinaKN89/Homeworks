package basetest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public abstract class BaseTest {
    protected WebDriver driver;
    protected String searchTerm = "Telerik Academy Alpha";

    @BeforeEach
    public void setupBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @AfterEach
    public void closeBrowser() {
        driver.close();
    }
}
