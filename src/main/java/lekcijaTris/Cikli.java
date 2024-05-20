package lekcijaTris;

import lekcijaPieci.Person;

public class Cikli {
    public static void main(String[] args) throws Exception {

        Person person=new Person(5);
//        person.name
        //while =kamer; true pa apli

        int i = 0; //iterators

        while (i < 5){
            System.out.println("Print i: " + i);
            i = i + 1;
//            i++; //tas ir identiski tas pats

            //kamer i mazaks par 5 tad izprinte lidz 4, jo < 5.

//        while (true){
//            System.out.println("Print text....");
            //nekad neapstajas



        }

        int a = 0;
        while (a < 3){
            System.out.println("Print i: " + i);

            a = a + 2;
        }

        for (int j = 0; j < 10; j++) { //j=j+1 = j++
            System.out.println("Cikls izpildās " + j + "reizi");

        }


        static void printNameSurname(){
            System.out.println("=======");
            System.out.println("Maris");
            System.out.println("Gzibovskis");



        }
    }
}
