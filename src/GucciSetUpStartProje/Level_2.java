package GucciSetUpStartProje;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Level_2 extends BaseDriver {
    @Test
    public void GucciMan(){
        driver.get("https://www.gucci.com/tr");
        driver.manage().timeouts().pageLoadTimeout( Duration.ofSeconds(20) );
        List<WebElement> cookiesAccept = driver.findElements(By.id("onetrust-accept-btn-handler"));
        if (cookiesAccept.size() > 0) // varsa
            cookiesAccept.get(0).click();
        MyFunc.Bekle(5);


        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        WebElement catagories = driver.findElement(By.id("menu-icon-btn"));
        catagories.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-icon-btn")));

        MyFunc.Bekle(5);
        WebElement mens = driver.findElement(By.linkText("Sign In"));
        mens.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign In")));







    }
}
