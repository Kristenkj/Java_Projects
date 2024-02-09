package src.oops.o07_Dec.Notes;

public class Lab117 {
    public static void main(String[] ref_name) {
        System.out.println("Run fine!!");

        int d = main(28);
        System.out.println(d);
        main("Kristen");

    }

    static void main(String a){
        System.out.println("I am a Main function but JVM doesn't recognize me");
    }

    static int main(int a){
        return a+101;
    }
}
