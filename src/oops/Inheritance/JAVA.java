package src.oops.Inheritance;

public class JAVA extends Programming {

    String newFeature;
    String author;
    JAVA(){
        System.out.println("Java Default Constructor");
    }

    JAVA(String feature){
        this.newFeature = feature;
    }
    void printInfo(){
        System.out.println("Child Information");
        System.out.println("Feature is  " + this.newFeature);
        System.out.println("Feature is  " + this.newFeature);
    }



}
