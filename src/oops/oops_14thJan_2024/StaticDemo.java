package src.oops.oops_14thJan_2024;

public class StaticDemo {

    //Static Variable
    public static String college_name = " TheTestingAcademy";

    //Non static variable --> Local variable or Instance variable
    public int version = 3;

    //Static method
    public static void printName() {
        System.out.println("Name is : " + college_name);
        //Don't have to use this. because this is static.
        // You can't have an Instance variable into the Static Method!!
        //System.out.println("Version is : " + version);
    }


    //Non-Static method
    public void printVersion() {
        int age = 40;
        System.out.println("Name is : " + college_name);
        System.out.println("Version is : " + version);
    }

}


