package lekcijaTris;

public class Masivi {
    public static void main(String[] args) {

        //piem.,trolejbusa pieturas sarakstu
        String pietura = "Centrala stacija";
        String pietura1 = "Marijas iela";
        String pietura2 = "Lacplesa iela";

        //var visas pieturas ielikt 1 masiva jeb array
        String[] pieturas = {"Centrala stacija", "Marijas iela", "Lacplesa iela", "Matisa iela", "Jauna pietura", "sesta pietura"};
//        System.out.println(pieturas[0]);
//        System.out.println(pieturas[1]);
//        System.out.println(pieturas[2]);
//        System.out.println(pieturas[3]);
       int garums = pieturas.length;



        for (String s : pieturas) {
            System.out.println("pietura " + s);
        }
        for (int i = 0; i < pieturas.length; i++) {
            System.out.println(pieturas[i]);
        }

        //piem., definet maju numurus
        int[] majuNumuri = {1,3,5,7,9,11};

        for (int maris : majuNumuri) {
        System.out.println("maju numuri" + maris);

    }

        System.out.println(majuNumuri[2]); //ar 2 izprintēs ārā māju nr.5

        String autoMarkas = new String[3]; //masiva bus 3 elementi
        autoMarkas[0]="BMW";
        autoMarkas[1]="Audi";
        autoMarkas[2]="Mercedes";

        System.out.println(autoMarkas[1]);


        int[] dienasJanvari = {1,2,3,4,5,6,7,8,9};

        //masiviem visas skaitisana sakas no 0. 0=pirmais pec kartas, 1=otrais pec kartas...

    }
}
