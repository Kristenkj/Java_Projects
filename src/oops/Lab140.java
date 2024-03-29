package src.oops;

public class Lab140 {
    public static void main(String[] args) {

        // this
        // constructor
        // inheritance
        // ecap
        // abstrc
        // super()

        ATBPerson p = new ATBPerson(); // Default constructor
        p.name = "Amit";
        p.printDetails();

        ATBPerson p3 = new ATBPerson("Pramod"); // Default constructor
        // p3.name = "Pramod"; Instead of using p3.name here we can use it in line 17
        p3.printDetails();

        ATBPerson p2 = new ATBPerson("Kristen");
        p2.printDetails();//param constructor



//        String s; // Local Variable default value is never assigned by JVM
//        System.out.println(s);



        // Constructor
        // Constructor is used to construct the object of a class.
        // name must be exactly the same as class
        // constructor is a special method.
        // it does not have a return type

        // - Default Constructor 18-19%
        //- Param Constructor - 70%
        // Copy Constructor in Java - <%1
    }
}
