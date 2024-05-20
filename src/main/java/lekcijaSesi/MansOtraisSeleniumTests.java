package lekcijaSesi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MansOtraisSeleniumTests extends BaseTest{

    private void attemptToLogin(String email, String password){
        driver.get("https://qaproject.acodemy.lv/login");

        WebElement loginEmailInput=driver.findElement(By.id("email"));
        WebElement loginPasswordInput=driver.findElement(By.id("password"));
        WebElement loginButton= driver.findElement(By.className("btn-primary"));

       //aizstaju email seit - loginEmailInput.sendKeys("emilysinclair@gmail.com");
        loginEmailInput.sendKeys(email);
        //aizstaju password seit - loginPasswordInput.sendKeys("qwerty123456#");
        loginPasswordInput.sendKeys(password);
        loginButton.click();
    }

    @Test
    public void successfullLoginTest() throws InterruptedException {
//        driver.get("https://qaproject.acodemy.lv/login");
////        Thread.sleep(5000);
//
//        WebElement loginEmailInput=driver.findElement(By.id("email"));
//        WebElement loginPasswordInput=driver.findElement(By.id("password"));
//        WebElement loginButton= driver.findElement(By.className("btn-primary"));
//
//        loginEmailInput.sendKeys("emilysinclair@gmail.com");
//        Thread.sleep(2500);
//        loginPasswordInput.sendKeys("qwerty123456#");
//        Thread.sleep(2500);
//        loginButton.click();
//        Thread.sleep(2500);

        attemptToLogin("emilysinclair@gmail.com","qwerty123456#");

        WebElement nameDropdown=driver.findElement(By.id("navbarDropdown"));
        Assert.assertEquals(driver.getCurrentUrl(),"https://qaproject.acodemy.lv/home","User is not navigated to home URL");
//        System.out.println(nameDropdown.getText());
        Assert.assertEquals(nameDropdown.getText(),"Emily","Wrong username visible in header dropdown");


    }

    @Test
    public void wrongCredentialsLoginTest() throws InterruptedException {
        attemptToLogin("wrongysinclair@gmail.com","wrong321AA");
//        driver.get("https://qaproject.acodemy.lv/login");
//
//        WebElement loginEmailInput=driver.findElement(By.id("email"));
//        WebElement loginPasswordInput=driver.findElement(By.id("password"));
//        WebElement loginButton= driver.findElement(By.className("btn-primary"));
//
//        loginEmailInput.sendKeys("wrongemail@gmail.com");
//        Thread.sleep(2500);
//        loginPasswordInput.sendKeys("wrongPassword123");
//        Thread.sleep(2500);
//        loginButton.click();

        WebElement emailFieldErrorMessage=driver.findElement(By.className("invalid-feedback"));
        //parbauda vienmer ar assert
        Assert.assertEquals(emailFieldErrorMessage.getText(),"These credentials do not match our records.","Wrong credential message");


        Thread.sleep(5000);


    }

    @Test
    public void emptyEmailLoginFieldTest(){
attemptToLogin("","truepassword");
    }

    @Test
    public void emptyPasswordLoginFieldTest(){
        attemptToLogin("trueemail@gmail.com","");
    }
}
