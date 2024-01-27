package src.basics;

public class Lab135 {
    public static void main(String[] args) {


        // If something is Thread Safe, we avoid!
        // StringBuffer vs StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Kristen");
        stringBuilder.reverse();
        System.out.println(stringBuilder);



    }
}
