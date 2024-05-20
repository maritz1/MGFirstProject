package lekcijaSesi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class MyFirstSeleniumTest extends BaseTest{
//    WebDriver driver;
@Test
    public void myFirstSeleniumTest() throws InterruptedException {
    //atveru parlukprogrammu; driver ir tas, ka es tieku klat parlukprogrammai
//    WebDriver driver=new ChromeDriver();
//    //macibu laika nopauzeju ar sleep, lai redzetu ka strada
//    driver.manage().window().maximize();
    //atveru konkretu lapu
    driver.get("https://www.google.lv");

    Thread.sleep(5000);



    //aizveru parlukprogrammu
//    driver.close();
}

@Test
    public void checkPageTitleTest(){
//    WebDriver driver=new ChromeDriver();
    driver.get("https://www.acodemy.lv");
    Assert.assertEquals(driver.getTitle(),"IT Kursi Latvija","Wrong page title!");
//    driver.close();

}

@Test
public void randomMarisTest(){

}

//@BeforeMethod
//    public void setUpBrowser(){
//    driver=new ChromeDriver();
//    driver.manage().window().maximize();
//
//}
//
//@AfterMethod
//    public void closeBrowser(){
//    driver.close();
//}


    //uzrakstit jaunu testu, kas parbaudis vai URL ir korekts
    @Test
            public void checkPageURLTest (){
    //aizeju uz meklejamo saiti
        driver.get("https://www.1a.lv");
        //rakstu assert parbaudot vai URL sakrit ar to, kuru es iekopeju
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.1a.lv","Wrong page URL!");

    }


}
