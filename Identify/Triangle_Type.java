package Identify;

import java.util.Scanner;

public class Triangle_Type {
    public static void main(String[] args) {

   /*
   This program classifies a triangle based on its side lengths.
   The program will determine if the triangle is equilateral (all sides are equal),
   isosceles (exactly two side are equal), or
   scalene (no sides are equal).
    */

    //side 1, side 2, side 3 --> side 1 = side 2 = side 3 --> equilateral
    //(side 1 = side 2) or (side 2 = side 3) or (side 1 = side 3) --> isosceles
    // side 1 != side 2 != side 3 --> scalene

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of the triangle to find out how it is classified: ");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if((side1 == side2) && (side2 == side3) && (side1 == side3)){
            System.out.println("The triangle is a equilateral");
        } else if ((side1 == side2) || (side1 == side3) || (side2 == side3)) {
            System.out.println("The triangle is a isosceles");
        } else{
            System.out.println("The triangle is a scalene");
        }
    }
}
