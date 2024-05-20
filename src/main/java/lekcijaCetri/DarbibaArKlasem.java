package lekcijaCetri;

import java.util.ArrayList;

public class DarbibaArKlasem {
    public static void main(String[] args) {
//        Dog mansSuns = new Dog();
        Dog mansSuns = new Dog("Reksis",5,13.5, "VAS");
        mansSuns.kepuSkaits=4;
        System.out.println("Kepu skaits manam sunim " + mansSuns.kepuSkaits);
        mansSuns.name = "Reksis";
        mansSuns.age = 5;
        mansSuns.weight = 13.3;
        mansSuns.breed = "VAS";

        mansSuns.makeSound();
        mansSuns.printDog();

//        Dog kaiminaSuns = new Dog();
//        kaiminaSuns.name = "Fido";
//        kaiminaSuns.age = 8;
//        kaiminaSuns.weight = 25.1;
//        kaiminaSuns.breed = "Dalmacietis";

        Dog kaiminaSuns = new Dog();
        kaiminaSuns.kepuSkaits=3;
        kaiminaSuns.setName("Fido");
        kaiminaSuns.setAge(8);
        kaiminaSuns.setWeight(13.3);
        kaiminaSuns.setBreed("Dalmacietis");
        System.out.println(kaiminaSuns.getName());
        System.out.println("Kepu skaits kaimina sunim " + kaiminaSuns.kepuSkaits);

        kaiminaSuns.printDog();
        kaiminaSuns.makeSound();


        Home manaMaja = new Home();
        manaMaja.ielasNosaukums = "Brivibas iela";
        manaMaja.majasNumurs = 100;
        manaMaja.printAddress();

        ArrayList<String> materiali = new ArrayList<>();
        materiali.add("Parkets");
        materiali.add("Flizes");

        manaMaja.apdaresMateriali = materiali;

        Velosipeds velosipeds = new Velosipeds();
//
//        VeloTips manstips = new VeloTips();
//        manstips.tips="MTB";
//        manstips.paredzetaisVecums=16;
//
//        velosipeds.tips = manstips;


        Circle rinkis1=new Circle(25);
        rinkis1.r=25;
        System.out.println("Rinka laukums ir " + rinkis1.calculateArea());
        System.out.println("Rinka diametrs ir " + rinkis1.calculateDiameter());

        Circle rinkis2=new Circle(32);
        rinkis2.r=32;
        System.out.println("Rinka laukums ir " + rinkis2.calculateArea());
        System.out.println("Rinka diametrs ir " + rinkis2.calculateDiameter());

    }
}
