package lekcijaCetri;

import java.util.ArrayList;

public class LekcijaCetri {

    public static void main(String[] args) {
//        masivs ar 3 elementiem
        String[] cars = {"VW", "Audi", "BMW"};
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);

        cars[0]="Mazda";

        for (String car : cars) {
            System.out.println(car);

        }

//        array list ar 3 elementiem
        ArrayList<String> cars2 = new ArrayList<>();
        ArrayList<Integer> majuNumuri = new ArrayList<>();
        ArrayList<Character> characters = new ArrayList<>();

        cars2.add("Mercedes");
        cars2.add("Bentley");
        cars2.add("Honda");

        System.out.println("Vai saraksts satur vardu Honda?" + cars2.contains("Honda"));
        System.out.println("Vai saraksts satur vardu Volvo?" + cars2.contains("Volvo"));


        System.out.println(cars2.get(0));
        System.out.println(cars2.get(1));
        System.out.println(cars2.get(2));

        System.out.println("For Cikls");
        for (int i = 0; i < cars2.size(); i++) {
            System.out.println(cars2.get(i));
        }

        System.out.println("For Each Cikls");
        for (String s : cars2) {
            System.out.println(s);

        }
        cars2.remove(0);

        System.out.println("For Each Cikls ar Remove 0");
        for (String s : cars2) {
            System.out.println(s);

        }

        System.out.println(cars2.get(0));

        cars2.set(0, "Volvo");
        System.out.println("For Each Cikls ar Set 0");
        for (String s : cars2) {
            System.out.println(s);

        }

        cars2.remove(o: "Honda");

        System.out.println("For Each Cikls ar Delete Honda");
        for (String s : cars2) {
            System.out.println(s);

        }
//
//        cars2.add("test");
//        cars2.remove(0);
//        cars2.set(1, "123123");
//        cars2.get(0);

    }
}
