package Identify;

import java.util.Scanner;

public class Letter_Identifier {
    public static void main(String[] args) {
        /*
        This program identifies and informs the user if an alphabet character is a vowel or consonant
        */

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an alphabet character and I will tell you if it is a vowel or consonant:");
        char letters = sc.nextLine().toCharArray()[0];

        switch(letters){
            case 'A','E','I','O','U':
                System.out.println("This is a vowel."); //This is the same as the code commented out below.
                break;                                 //However,it saves space.
        /* case 'E' :
                System.out.println("This is a vowel.");
                break;
            case 'I':
                System.out.println("This is a vowel.");
                break;
            case 'O' :
                System.out.println("This is a vowel.");
                break;
            case 'U':
                System.out.println("This is a vowel.");
                break; */
            case 'Y' :
                System.out.println("This is a vowel sometimes.");
                break;
            default:
                System.out.println("This is a consonant");
        }
    }
}
