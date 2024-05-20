package lekcijaPieci;

import lekcijaCetri.Circle;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstTest {

    @Test
    public void calculateDiameterTest(){
        Circle rinkis = new Circle(5);
        double diametrs = rinkis.calculateDiameter();
        Assert.assertEquals(diametrs,10,"Diametrs ir nepareizi aprekinats");


    }
    @Test
    public void calculateAreaTest(){
        Circle rinkis = new Circle(5);
        double laukums = rinkis.calculateArea();
        Assert.assertEquals(laukums,78.5,"Laukums nepareizi aprekinats");

    }


    @Test
    public void testCalculator(){
        Calculator calculatorAtnem = new Calculator();

//        mans variants
        int atnemsana = calculatorAtnem.atnemsana(6,3);
        Assert.assertEquals(atnemsana,3,3);


        calculatorAtnem.atnemsana(3,5);
        calculatorAtnem.atnemsana(3.3,5.4);


    }

}
