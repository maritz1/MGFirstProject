package lekcijaSesi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;


    @BeforeMethod
    public void setUpBrowser(){
        driver=new ChromeDriver();
        //noradu, cik selenium ilgi gaidis konkreto elementu lapaa.. ja noraditaja laika neparadisies elements lapaa, tad tas bus kludas pazinojums..
        driver.manage().timeouts().implicitlyWait(Duration.of(5));
        driver.manage().window().maximize();
//        driver.get("https://qaproject.acodemy.lv/");
    }

    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }
}
