package lekcijaSesi;

import lekcijaSesi.pageObjects1a.OneALandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.List;

public class BrowserNavigation extends BaseTest{

    @Test
    public void testBrowserNavigation() throws InterruptedException {
        driver.get("https://www.1a.lv/");
        WebElement smartNetBanner=driver.findElement(By.className("smart-net-banner__info-button-text"));
        smartNetBanner.click();

List<WebElement> listOfInputFields = driver.findElements(By.className("users-session-form__input--text"));



        for (WebElement listOfInputField : listOfInputFields) {
            listOfInputField.sendKeys("Maris");

        }



        //back
driver.navigate().back();

        //forward
driver.navigate().forward();

        //refresh
driver.navigate().refresh();




Thread.sleep(6000);

    }

    @Test
    public void testAcceptCookiesIn1a() throws InterruptedException {
        driver.get("https://www.1a.lv/");
        WebElement acceptAllCookiesButton = driver.findElement(By.id("cybotCookiebotDialogBodyLevelButtonLevelOptinAllonAll"));
        WebElement cookieBanner = driver.findElement(By.id("cookiebanner"));
        Assert.assertTrue(cookieBanner.isDisplayed(),"Cookie banner is not displayed");

        System.out.println(cookieBanner.getTagName());
//       atgriezis elementa nosaukumu, piem.div, a u.tml.
        Assert.assertEquals(cookieBanner.getCssValue("display"),"block");


        acceptAllCookiesButton.click();
//        parbaudu ka tas ir neredzams..
        Assert.assertFalse(cookieBanner.isDisplayed(),"Cookie banner is displayed");
        Assert.assertEquals(cookieBanner.getCssValue("display"),"none");

        List<WebElement> cookiebanners = driver.findElements(By.id("cookiebanner"));
//        un parbaudu, ka sis saraksta (list) izmers (size) ir 0..
        Assert.assertEquals(cookiebanners.size(),0);
        System.out.println("Hello world");
        Thread.sleep(6000);
        //ka parbaudisim, ka pazud cookies?
    }

    @Test
    public void test220cookies(){
        driver.get("https://220.lv/lv/");
//no sakuma parbaudu vai cookie eksiste uz lapas..
//        cau incognito logu tur kur redzams "accept all cookies" (neakcepteju) un atdrodu nosaukumu
        WebElement cookieBlock = driver.findElement(By.className("cookie_wrapper"));
        Assert.assertTrue(cookieBlock.isDisplayed(),"Cookie block is not displayed");
//   //div[@class='cookies_wrapper']//button[@widget-attachpoint='agree']
        driver.findElement(By.xpath("//div[@class='cookies_wrapper']//button[@widget-attachpoint='agree']")).click();
//        WebElement cookieBlock2 = driver.findElement(By.className("cookies_wrapper"));

        Assert.assertFalse(cookieBlock.isDisplayed(),"Cookie block ir redzams");
    }




    @Test
    public void testAttributesIn1a() throws InterruptedException {
        driver.get("https://www.1a.lv/");
        OneALandingPage oneALandingPage = new OneALandingPage(driver);

        List<WebElement> languageElements = driver.findElements(By.xpath("//li[contains(@class,'language-switcher')]/a"));
//        parbaudu, ka pec noklusejuma aiziet uz LV saitu..
//        WebElement cookieBanner = driver.findElement(By.id("cookiebanner"));
        Assert.assertEquals(oneALandingPage.cookieBanner.getAttribute("lang"),"lv");
//        //li[contains(@class,'language-switcher')]/a[text()='LV']
//        vairaki varianti ka nodefinet elementus ("LV" vai "RU")
//        oneALandingPage.switchLanguage("RU");
        languageElements.get(1).click();
        Thread.sleep(6000);
        Assert.assertEquals(oneALandingPage.cookieBanner.getAttribute("lang"),"ru");
//        oneALandingPage.switchLanguage("LV");
//        Assert.assertEquals(cookieBanner.getAttribute("lang"),"lv");

//        piem., ja accept all cookies, tad tas pazud no html. Tad jaizmanto dadzskaitli find.elements.




    }

@Test
    public void testKeyboardActions() throws InterruptedException {

        driver.get("https://www.selenium.dev/documentation/webdriver/actions_api/keyboard/");

//    Actions action = new Actions(driver);
    new Actions(driver)
            .keyDown(Keys.CONTROL)
            .sendKeys("K")
            .perform();
    Thread.sleep(6000);

    new Actions(driver)
            .sendKeys(Keys.ESCAPE)
            .perform();
    Thread.sleep(6000);


}
}
