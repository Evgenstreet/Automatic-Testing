import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class WebDriverLab9Test {
    private WebDriver driver;

    @Test
    public void addWatchesFortressGMTGreenToCart() throws InterruptedException {
        driver = new ChromeDriver();
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

        Assert.assertNotNull(driver.findElement(By.id("CartContainer")));
    }
}
