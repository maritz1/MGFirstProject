package lekcijaSesi.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QaProjectLandingPage {

    WebDriver driver;

//    @FindBy(xpath = "//div[contains(@class,'top-0']/a")
//    WebElement homeLink;

    //div[contains(@class,'top-0']/a[text()='Home']
    @FindBy(xpath = "//div[contains(@class,'top-0']/a[text()='Home']")
    WebElement homeLink;

    //div[contains(@class,'top-0']/a[text()='Login']
    @FindBy(xpath = "//div[contains(@class,'top-0']/a[text()='Login']")
    WebElement loginLink;

    //div[contains(@class,'top-0']/a[text()='Register']
    @FindBy(xpath = "//div[contains(@class,'top-0']/a[text()='Register']")
    public WebElement registerLink;

    //div[@class='flex items-center']//a
    @FindBy(xpath = "//div[@class='flex items-center']//a")
    WebElement qaPostsLink;

    public QaProjectLandingPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //var rakstit vairakos veidos.. saja metoda es parbaudu, vai visi elementi eksiste uz lapas.. (1) varu rakstit katram elementam "is dispalyed", (2) vai caur "return"..
    public boolean checkIfElementsExistOnPage(){
        //true es dabusu atpakal tikai taja gadijuma, ja visi
        return qaPostsLink.isDisplayed() && loginLink.isDisplayed() && registerLink.isDisplayed();


    }

}
