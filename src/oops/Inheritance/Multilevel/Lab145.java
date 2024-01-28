package src.oops.Inheritance.Multilevel;

public class Lab145 {
    public static void main(String[] args) {
        //Grandpa g = new Grandpa();
//      Father f = new Father();
//      Son s = new Son();
//
//
//      Grandpa g = new Son();
//
//
//      Father f = new Son();
//      Son s  = new Grandpa();
//      Son s = new Father();
//      Son s = new Son();

        Grandpa g = new Son();//Grandpa cal only access his and only knows about him
        g.bhk3();

        Son s = new Son();//Son can access all 3 and knows about everyone
        s.bhk1();
        s.bhk2();
        s.bhk3();



    }

}
