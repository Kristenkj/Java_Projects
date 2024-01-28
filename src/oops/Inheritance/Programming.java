package src.oops.Inheritance;

public class Programming {

    int version;
    String author;

    Programming(){
        System.out.println("Programming Default Constructor");
    }

    Programming(String author, int version){
        this.author = author;
        this.version = version;
    }

    void printInfo(){
        System.out.println("Program Info: " + this.version + " Author: " + this.author);
    }

    void car(){
        System.out.println("Lambo");
    }

    void bhk3(){
        System.out.println("bhk3 House");
    }
}
