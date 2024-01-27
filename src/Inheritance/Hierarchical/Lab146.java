package src.Inheritance.Hierarchical;

public class Lab146 {
    public static void main(String[] args) {
        new Car();
        Truck t = new Truck();
        Vehicle v = new Vehicle();

        Vehicle v1 = new Car();
        //Car c2 = new Vehicle(); Not Possible
        //Truck t1 = new Vehicle(); Not possible


        //Car c3 = new Truck();Not Possible because there is no relationship in hierarchical





    }
}
