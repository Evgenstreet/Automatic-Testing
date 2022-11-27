package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GrahamItemPage extends AbstractPage{

    public static String GRAHAM_BandB_PAGE_URL = "https://graham1695.com/collections/new-collection/products/fortress-gmt-b-b";
    public static String GRAHAM_GREEN_PAGE_URL = "https://graham1695.com/collections/new-collection/products/fortress-gmt-green";

    @FindBy(id = "AddToCart-6591917621312")
    private WebElement buttonAddGreenToCart;

    @FindBy(id = "AddToCartText-6591918243904")
    private WebElement buttonAddBandBToCart;

    @FindBy(className = "cart-link")
    private WebElement cartIcon;

    public GrahamItemPage(WebDriver driver) {
        super(driver);
    }

    public GrahamItemPage addItemToCart(String modelOfWatchesUrl){
        if("modelOfWatchesUrl" == "GRAHAM_BandB_PAGE_URL") {
            new WebDriverWait(driver, Duration.ofSeconds(7))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("AddToCartText-6591918243904")));
            buttonAddGreenToCart.click();
        }
        else if ("modelOfWatchesUrl" == "GRAHAM_GREEN_PAGE_URL"){
            new WebDriverWait(driver, Duration.ofSeconds(7))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("AddToCart-6591917621312")));
            buttonAddBandBToCart.click();
        }
        return this;
    }

    public boolean checkCorrectProductInCart(String url) {
        return driver.getCurrentUrl().equals(url);
    }


    @Override
    public GrahamItemPage openPage(String url){
        driver.get(url);
        return this;
    }
}
