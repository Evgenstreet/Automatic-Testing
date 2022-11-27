package page;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GrahamCartPage extends AbstractPage{

    public static String GRAHAM_CART_PAGE_URL = "https://graham1695.com/collections/new-collection/products/fortress-gmt-b-b";

    @FindBy(id = "AddToCart-6591917621312")
    private WebElement buttonAddGreenToCart;


    @FindBy(className = "cart-link")
    private WebElement cartIcon;

    public GrahamCartPage(WebDriver driver) {
        super(driver);
    }

    public GrahamCartPage addItemToCart(){
            new WebDriverWait(driver, Duration.ofSeconds(7))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("AddToCartText-6591917621312")));
            buttonAddGreenToCart.click();
        return this;
    }

    public boolean changeQuantityAndCheckEquality() throws InterruptedException {
        new WebDriverWait(driver, Duration.ofSeconds(8))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("CartDrawer")));
        Thread.sleep(3000);
        String valueString = driver.findElement(By.xpath("//*[@id=\"CartContainer\"]/div[2]/div/div[2]/p")).getText();
        valueString = valueString.replace("$", "");
        valueString = valueString.replace(",", "");
        Double valueBeforeChanging = Double.parseDouble(valueString);
        new WebDriverWait(driver, Duration.ofSeconds(8))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("CartDrawer")));
        Select quantitySelector = new Select(driver.findElement(By.id("updates_39393083260992:b8880354fb2c00d0e23c1eabd25b6193")));
        quantitySelector.selectByVisibleText("2");
        valueString = driver.findElement(By.xpath("//*[@id=\"CartContainer\"]/div[2]/div/div[2]/p")).getText();
        valueString = valueString.replace("$", "");
        valueString = valueString.replace(",", "");
        Double valueAfterChanging = Double.parseDouble(valueString);
        return valueAfterChanging.equals(valueBeforeChanging*2.0);
    }

    @Override
    public GrahamCartPage openPage(String url) {
        driver.get(url);
        return this;
    }
}
