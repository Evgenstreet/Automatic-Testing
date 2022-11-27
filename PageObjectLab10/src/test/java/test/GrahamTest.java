package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.GrahamCartPage;
import page.GrahamItemPage;

import static page.GrahamItemPage.GRAHAM_BandB_PAGE_URL;
import static page.GrahamItemPage.GRAHAM_GREEN_PAGE_URL;

public class GrahamTest {
    private WebDriver driver;

    @BeforeMethod(
            alwaysRun = true
    )
    public void browserSetup() {
        ChromeOptions settings = new ChromeOptions();
        settings.addArguments("--no-sandbox", "--disable-dev-shm-usage", "--window-size=1920,1080", "--disable-extensions",
                "--proxy-server='direct://'", "--proxy-bypass-list=*", "--start-maximized", "--disable-gpu", "--ignore-certificate-errors");
        this.driver = new ChromeDriver(settings);
        this.driver.manage().window().maximize();
    }
    @Test
    public void addWatchesFortressGMT_BandB_ToCart() {
        boolean cartCheck = new GrahamItemPage(driver)
                .openPage(GRAHAM_BandB_PAGE_URL)
                .addItemToCart("GRAHAM_BandB_PAGE_URL")
                .checkCorrectProductInCart(GRAHAM_BandB_PAGE_URL);
        Assert.assertTrue(cartCheck);
    }

    @Test
    public void addWatchesFortressGMTGreenToCart() {
        boolean cartCheck = new GrahamItemPage(driver)
                .openPage(GRAHAM_GREEN_PAGE_URL)
                .addItemToCart("GRAHAM_GREEN_PAGE_URL")
                .checkCorrectProductInCart(GRAHAM_GREEN_PAGE_URL);
        Assert.assertTrue(cartCheck);
    }

    @AfterTest(
            alwaysRun = true
    )
    public void browserTakeDown() {
        this.driver.quit();
        this.driver = null;
    }
}
