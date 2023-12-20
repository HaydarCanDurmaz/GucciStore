package GucciSetUpStartProje;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.CompositeAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Level_1 extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://www.gucci.com/tr");
        MyFunc.Bekle(5);
        List<WebElement> cookiesAccept = driver.findElements(By.id("onetrust-accept-btn-handler"));
        if (cookiesAccept.size() > 0) // varsa
            cookiesAccept.get(0).click();
        MyFunc.Bekle(5);

      //  WebElement catagories = driver.findElement(By.cssSelector("button[id='menu-icon-btn']"));
      //  catagories.click();
        MyFunc.Bekle(2);
        WebElement searc = driver.findElement(By.cssSelector("button[aria-label='search']"));
        searc.click();

        MyFunc.Bekle(2);
        WebElement handbags = driver.findElement(By.id("search-input"));



       // handbags.sendKeys("Mens Bags");


        Actions aksiyonlar = new Actions(driver);



        Action aksiyon = aksiyonlar.moveToElement(handbags).click().keyDown(Keys.SHIFT).sendKeys("h").keyUp(Keys.SHIFT).sendKeys("andbags").keyDown(Keys.ENTER).build();
        MyFunc.Bekle(5);
        aksiyon.perform();


     //   MyFunc.Bekle(2);

       // BekleVeKapat();

    }

}
