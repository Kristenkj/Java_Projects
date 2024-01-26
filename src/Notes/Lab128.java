package src.Notes;

public class Lab128 {
    public static void main(String[] args) {
        //Reverse name
        String name = "Kristen"; // K r i s t e n

        String y = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            y = y + name.charAt(i);
        }
        System.out.println(y);


    }
}
