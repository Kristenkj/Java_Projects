package src.oops;

public class Dog {
    String name; //Instance Variable

    //Constructor
    Dog (){
        System.out.println("Default Doggie");
    }
    Dog(String nameRef){
        this.name = nameRef;
        System.out.println("Param Doggie");
    }

    //Attribute / Data member / variable


    //Methods/ Behavior

    void eat(){
        System.out.println("Dog Food");
    }
    void bark(){
        System.out.println("Bark");
    }
    void printDetail() {
        System.out.println("Dog name is " + this.name);
    }


}
