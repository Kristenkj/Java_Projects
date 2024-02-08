package Calculators;

import java.util.Scanner;

public class Grade_Calc01 {
    public static void main(String[] args) {

        /* This program creates a basic grade calculator.
         * The calculator will calculate and display the letter grade based on
         * the grading scale after taking a number as input:
         * A : 90 - 100
         * B: 80-89
         * C: 70 -79
         * D: 60-69
         * F: 0-59
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the students score:");
        int score = sc.nextInt();
        byte apple_size = 3;

        if (score >= 90 && score <= 100) {
            System.out.println("Your score is A");//love
        } else if (score >= 80 && score <= 89) {
            System.out.println("Your score is B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Your score is C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("Your score is D");
        } else {
            System.out.println("Your score is F");
        }



    }
}
