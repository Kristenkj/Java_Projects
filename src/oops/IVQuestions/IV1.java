package src.oops.IVQuestions;

import src.oops.Person;

public class IV1 {

    public static void main(String[]args){

        Person h = new Person();
        System.out.println(h.a);

        Person h2 = new Person();
        System.out.println(h2.a);

        Person h3 = new Person(23,true);
        System.out.println(h.b);
    }
}
