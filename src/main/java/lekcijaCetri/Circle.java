package lekcijaCetri;

public class Circle {

////    Circle(){
////        System.out.println("Tiek taisits jauns aplis...");
//////        r=15;
//    }
    public Circle(double radiuss){
        this.r=radiuss;
    }

    double PI = 3.14;
    double r;
    public double calculateArea(){
        return PI * (r*r);



    }

    public double calculateDiameter(){
        return r*2;
    }




}
