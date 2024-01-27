package src.oops;

public class Person {

    //Attribute

    String name;
    long phoneNumber;
    double height;
    int age;
    String address;
    String gender;
    String emailId;
    String education;

    //Behavior - What a person can do?

    void sleep(){
        System.out.println("Want to sleep");
    }

    void talk(){
        System.out.println("Talk");
    }

    boolean isMarried() {
        return true;
    }
    Person(){
        System.out.println("Default Person");
    }
    Person(String referenceName){
        this.name = referenceName;
    }

    void printDetail(){
        System.out.println("Your name is " + this.name);
    }

}
