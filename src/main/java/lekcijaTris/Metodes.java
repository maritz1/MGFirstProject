package lekcijaTris;

public class Metodes {
    public static void main(String[] args) {

        printInfoAboutDog();
        printInfoAboutDog();
        printInfoAboutDog();

//String dogName = "Reksis";
//int dogAge = 8;
//double dogWeight = 10.3;
//        System.out.println("Mans suna vards ir: " + dogName);
//        System.out.println("Mans suna vards ir: " + dogAge);
//        System.out.println("Mans suna vards ir: " + dogWeight);

        //lai izprintet daudz to pasu, tad jauna metode




        aprekinatTaisnsturaLaukumu(6,7);
int aprekinataisLaukums = aprekinatTaisnsturaLaukumu(6,7);
        System.out.println("Laukums ir: " + aprekinataisLaukums);
    }

    static void printetTaisnsturaLaukumu(int a, int b){
        System.out.println("Laukums ir: " + (a*b));

        int kvadrataLaukums = aprekinatKvadrataLaukumu( kvadrataMala: 10);
        System.out.println("kvadrataLaukums");


        printAboutDog2( name: "Lesija", age: 5, weight: 15.3);

        System.out.println("Rinka laukums ir: " + aprekinatRinkaLaukumu(radiuss: 3));
    }


    static double aprekinatRinkaLaukumu(int radiuss){
        double pi = 3.1445545555555555;
        return 3.14 * (radiuss * radiuss);


    }
    static int aprekinatKvadrataLaukumu(int kvadrataMala){
        return kvadrataMala * kvadrataMala;
    }
static int aprekinatTaisnsturaLaukumu(int a, int b){
        int laukums = a*b;
        return laukums;
        //si bus tada ka universala metode
    //mainigos drikst daudz likt



}



    static void printInfoAboutDog(){

        String dogName = "Reksis";
        int dogAge = 8;
        double dogWeight = 10.3;

        System.out.println("Mans suna vards ir: " + dogName);
        System.out.println("Mans suna vards ir: " + dogAge);
        System.out.println("Mans suna vards ir: " + dogWeight);


        //metodes autotestesanai=setupBrowser, serchForItemsTest




    }
static void printAboutDog2 (String name, int age, double weight){
    System.out.println("Mans suna vards ir: " + name);
    System.out.println("Mans suna vecums ir: " + age);
    System.out.println("Mans suna svars ir: " + weight);
    System.out.println("\n");


}

}
