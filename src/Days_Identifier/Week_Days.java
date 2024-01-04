package src.Days_Identifier;

import java.util.Scanner;

public class Week_Days {
    public static void main(String[] args) {

        /*
        This program identifies the days/date 1- 7 of the week and tells you the day of the week that it is.
        Monday: 1       Thursday:4      Sunday: 7
        Tuesday: 2      Friday:5
        Wednesday: 3    Saturday: 6
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  1 - 7, I will tell you which day of the week it is:");
        int dayNumber = sc.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Entry Invalid. Please try again.");
                break;
        }
        System.out.println("- End of Program -");
    }
}
