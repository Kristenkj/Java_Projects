package src.basics.b03_Dec;

import java.util.Scanner;

public class Lab046 {
    public static void main(String[] args) {

        // Take an input from user? Java
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number, I will tell if it is even/odd");
        int a  = sc.nextInt();


        if(a%2 == 1){
            System.out.println("ODD Number");
        }else{
            System.out.println("Even Number");
        }



    }
}
