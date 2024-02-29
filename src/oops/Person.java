package src.oops;

public class Person {
    public boolean a;
    public boolean b;

    //Attribute

    String name;
    long phoneNumber;
    double height;
    int age;
    String address;
    String gender;
    String emailId;
    String education;

    public Person(int i, boolean b) {
    }

    //Behavior - What a person can do?

    void sleep(){
        System.out.println("Want to sleep");
    }

    void talk(){
        System.out.println("Talk");
    }

    boolean isMarried() {
        return true;//
    }
    public Person(){
        System.out.println("Default Person");
    }
    Person(String referenceName){
        this.name = referenceName;
    }

    void printDetail(){
        System.out.println("Your name is " + this.name);
    }

}
