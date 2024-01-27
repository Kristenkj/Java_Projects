package src.oops;

public class Lab139 {
    public static void main(String[] args) {

        //OOPs concept
        //Person - class blueprint
        //P - ref variable


        Person p = new Person();
        p.name = "Avery";
        System.out.println(p.name);

        Person p2 = new Person();
        p2.name = "Riley";
        System.out.println(p2.name);


        new Person();//object --> New object
        // Person ();//This is a method or function
        Person p3 = null;//Reference pointing to null so it is not an object
        System.out.println("End of the Program");

        //There are 3 objects because p, p2 and new qualify as objects. You need 'new' to create an object
        //p,p2 and p3 are all references
        //p points to Avery, p2 points to Riley, and p3 points to null


    }
}
