import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


public class WebDriverLab9Test {
    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup(){
        ChromeOptions settings = new ChromeOptions();
        settings.addArguments("--no-sandbox", "--disable-dev-shm-usage", "--window-size=1920,1080",
                "--disable-extensions", "--proxy-server='direct://'", "--proxy-bypass-list=*", "--start-maximized",
                "--disable-gpu", "--ignore-certificate-errors");
        driver = new ChromeDriver(settings);
        driver.manage().window().maximize();
    }


    @Test
    public void addWatchesFortressGMTGreenToCart() throws InterruptedException {
        driver.get("https://graham1695.com/");

        WebElement buttonShopWatches = (new WebDriverWait(driver, Duration.ofSeconds(5)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"shopify-section-header\"]/div[3]/div[2]/div/div[2]/header/div[1]/div/div[2]/ul/li[2]/a")));
        buttonShopWatches.click();

        WebElement clickToWatch;
        clickToWatch = driver.findElement(By.xpath("//*[@id=\"CollectionSection\"]/div[2]/div[2]/div/a/div[1]/div[2]"));
        clickToWatch.click();

        WebElement buttonAddToCart;
        buttonAddToCart = driver.findElement(By.id("AddToCartText-6591917621312"));
        buttonAddToCart.click();
        Thread.sleep(5000);

        Assert.assertNotNull(driver.findElement(By.id("CartContainer")));
    }


    @AfterTest(alwaysRun = true)
    public void browserTakeDown() {
        driver.quit();
        driver = null;
    }
}
