package src.Inheritance.Hierarchical;

public class Vehicle {

    Vehicle(){
        System.out.println("Vehicle Default Constructor");
    }
    void vehicleHasTopSpeed(){
        System.out.println("Yeah from  "+ getClass().getSimpleName());
    }
}
