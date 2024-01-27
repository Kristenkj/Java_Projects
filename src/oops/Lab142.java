package src.oops;

import java.util.Scanner;

public class Lab142 {
    public static void main(String[] args) {

        Person p2 = new Person();//Default constructor is being referenced
        //new Person();
        //Person p;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();

        Person p3 = new Person(name);
        p3 .printDetail();//Have to use this with param constructor for it to print
    }
}
