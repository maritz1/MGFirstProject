package LekcijaDivi;

import java.util.Scanner;

public class Password {


    public static void main(String[] args) {
String istaParole = "password123";
        System.out.println("Ievadi savu paroli...");
        Scanner scanner = new Scanner(System.in);




        String ievaditaParole = scanner.nextLine();

        if (ievaditaParole.equals(istaParole)){
            //te izpildās, ja if ir true
            System.out.println("Parole pareiza! Apsveicu, esam ielogojusies");



        } else {
            System.out.println("Parole nepareiza! Piekļuve liegta!!!");
        }







    }


}
