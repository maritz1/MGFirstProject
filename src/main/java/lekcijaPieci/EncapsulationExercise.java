package lekcijaPieci;

public class EncapsulationExercise {
    public static void main(String[] args) throws Exception {
        Person cilveks = new Person(1);
//        cilveks.age=18;
        //lai varetu veikt parbaudes, lieku private

        cilveks.setAge(18);

//        System.out.println("Vecums:"+cilveks.age);
        System.out.println("Vecums: "+ cilveks.getAge());

        Car mansAuto = new Car();
        mansAuto.move();

        Motorcycle motorcycle=new Motorcycle();
        motorcycle.move();



    }
}
