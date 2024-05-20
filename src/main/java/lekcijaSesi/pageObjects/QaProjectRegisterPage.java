package lekcijaSesi.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class QaProjectRegisterPage {

    WebDriver driver;
    //selektori ir: name, last name, email address, confir..., birth date, password, checkbox, un register poga..
   @FindBy(id="name")
   public WebElement nameInputField;

    @FindBy(id="last_name")
    public WebElement lastNameInputField;

    @FindBy(id="email")
    public WebElement emailInputField;

    @FindBy(id="email-confirm")
    public WebElement emailConfirmInputField;

    @FindBy(id="birth_date")
    public WebElement birthDateInputField;

    @FindBy(id="password")
    public WebElement passwordInputField;

    @FindBy(id="password-confirm")
    public WebElement passwordConfirmInputField;

    @FindBy(xpath="//input[@type='checkbox']")
    public WebElement termsAndConditionsCheckbox;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement submitButton;

    //div[@class='card-header']
    @FindBy(xpath="//div[@class='card-header']")
    public WebElement registerFormHeaderSection;



    public QaProjectRegisterPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

public void fillInRegisterForm(String name, String lastName, String emailAddress, String confirmEmailAddress, String dateOfBirth, String password, String confirmPassword, Boolean isTCChecked){
    nameInputField.sendKeys("Maris");
    lastNameInputField.sendKeys("Gzibovskis");
    emailInputField.sendKeys(emailAddress);
    emailConfirmInputField.sendKeys(emailAddress);
    birthDateInputField.sendKeys("01/26/2000");
    registerFormHeaderSection.click();
    passwordInputField.sendKeys("parole123");
    passwordConfirmInputField.sendKeys("parole123");
    if (isTCChecked){
    termsAndConditionsCheckbox.click();
}
    submitButton.click();
}
