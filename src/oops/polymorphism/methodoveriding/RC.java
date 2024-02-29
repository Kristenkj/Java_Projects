package src.oops.polymorphism.methodoveriding;

public class RC {

    public static void main(String[] args ){
        Dog d = new Dog ();
        d.bark();

        Hound h = new Hound();
        h.bark();

        Dog f = new Hound(); // Dynamic Dispatch
        f.bark();            // Runtime Polymorphism

    }
}
