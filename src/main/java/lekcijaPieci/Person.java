package lekcijaPieci;

public class Person {
    private int age;
    protected String name;
    int height;

    Person(int age) throws Exception {
//        this.age = age;
        setAge(age);
    }

    //getter, setter = metodes ar kuram varu pieklut privatiem klases mainigajiem. getter/setter visbiezak bus publiski
//  public int getAge(){
//      return this.age;
//  }

    public int getAge() {
        return age;
    }

    //setter = palidzes uzstadit man piem.vecumu


    public void setAge(int age) throws Exception {
        if(age<=0){
//            System.out.println("Vecums nevar but negativs vai 0!!!");
            throw new Exception("Vecums nedrikst but mazaks par 0");
        }
        else {
            this.age = age;
        }
    }
}
