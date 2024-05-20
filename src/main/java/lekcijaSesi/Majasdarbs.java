package lekcijaSesi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Majasdarbs extends BaseTest{
    @Test
    public void test123() throws InterruptedException {
        driver.get("https://www.saucedemo.com/v1/");
        //ievadu UN un paroli
        WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
        Thread.sleep(5000);
        System.out.println(errorMessage.getText());




    }

}
