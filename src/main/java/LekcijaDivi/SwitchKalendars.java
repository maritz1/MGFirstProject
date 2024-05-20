package LekcijaDivi;

public class SwitchKalendars {
    public static void main(String[] args) {
        int day = 3;
        switch (day){
            case 1:
                System.out.println("pirmdiena");
                break;
            case 2:
                System.out.println("otrdiena");
                break;
            case 3:
                System.out.println("trešdiena");
                break;
            case 4:
                System.out.println("ceturtdien");
                break;
            case 5:
                System.out.println("piektdiena");
                break;
            case 6:
                System.out.println("sestdiena");
                break;
            case 7:
                System.out.println("svētdiena");
                break;
            default:
                System.out.println("Tāda diena neeksistē!!!");
        }
    }
}
