package src.Notes;

public class Lab120 {
    public static void main(String[] args) {
        // Write your code here
        int b = 10;
        int d = --b + b++ + b--;
        System.out.println(d);
        // A  Exp -> 9, b -> 9
        // B Exp -> 9, b -> 10
        // C Exp -> 10->  b -> 9

    }
}
