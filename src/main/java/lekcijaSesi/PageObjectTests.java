package lekcijaSesi;

import com.github.javafaker.Faker;
import lekcijaSesi.pageObjects.QaProjectHomePage;
import lekcijaSesi.pageObjects.QaProjectLandingPage;
import lekcijaSesi.pageObjects.QaProjectRegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageObjectTests extends QAProjectBaseTest{

    //uztaisu testu, vai konkreti elementi eksiste uz lapas.
    @Test
    public void checkAllElementsOnLandingPageTest(){
        QaProjectLandingPage qaProjectLandingPage=new QaProjectLandingPage(driver);
        Assert.assertEquals(qaProjectLandingPage.checkIfElementsExistOnPage(), true);
//        qaProjectLandingPage.registerLink.click();
    }

    @Test
    public void testSuccessfulRegistration()throws InterruptedException{
        Faker faker=new Faker();
        QaProjectLandingPage qaProjectLandingPage=new QaProjectLandingPage(driver);
        qaProjectLandingPage.registerLink.click();
//        Thread.sleep(5000);

        String name = "Maris";
        String lastName = "Gzibovskis";
        QaProjectRegisterPage qaProjectRegisterPage= new QaProjectRegisterPage(driver);
        qaProjectRegisterPage.fillInRegisterForm(name,lastName,emailAddress,emailAddress,"01/26/2000","parole123","parole123",true);
//        qaProjectRegisterPage.fillInRegisterForm("Maris","Gzibovskis",emailAddress,emailAddress,"01/26/2000","parole123","parole123",true);
//        qaProjectRegisterPage.nameInputField.sendKeys("Maris");
//        qaProjectRegisterPage.lastNameInputField.sendKeys("Gzibovskis");
//        String emailAddress= faker.internet().emailAddress();
//        qaProjectRegisterPage.emailInputField.sendKeys(emailAddress);
//        qaProjectRegisterPage.emailConfirmInputField.sendKeys(emailAddress);
//        qaProjectRegisterPage.birthDateInputField.sendKeys("01/26/2000");
//        qaProjectRegisterPage.registerFormHeaderSection.click();
//        qaProjectRegisterPage.passwordInputField.sendKeys("parole123");
//        qaProjectRegisterPage.passwordConfirmInputField.sendKeys("parole123");
//        qaProjectRegisterPage.termsAndConditionsCheckbox.click();
//        qaProjectRegisterPage.submitButton.click();
//        Thread.sleep(5000);

        //parbaudu vai lietotajs ielogojies?
        QaProjectHomePage qaProjectHomePage=new QaProjectHomePage(driver);
        Assert.assertEquals(qaProjectHomePage.menuDropDown.getText(),name);
        Assert.assertEquals(qaProjectHomePage.welcomeMessage.getText(),"Welcome, " + lastName + "! You are logged in!");

    }

    @Test
    public void testSuccessfulRegistrationTCUnchecked() throws InterruptedException{
        Faker faker=new Faker();
        QaProjectLandingPage qaProjectLandingPage=new QaProjectLandingPage(driver);
        qaProjectLandingPage.registerLink.click();
        QaProjectRegisterPage qaProjectRegisterPage= new QaProjectRegisterPage(driver);
        qaProjectRegisterPage.fillInRegisterForm("Maris","Gzibovskis",emailAddress,emailAddress,"01/26/2000","parole123","parole123",false);
        Thread.sleep(5000);


//ka zinat ka autotest ir registrejies login lapa? ka aiziet uz registracijas lapu?
}
