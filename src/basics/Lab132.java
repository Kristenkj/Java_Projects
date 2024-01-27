package src.basics;

public class Lab132 {
    public static void main(String[] args) {

        // Immutable in nature (that can't changed)
        String s1 = "Kristen";
        String s2 = new String("Kristen");


        // Mutable - that can be changed!!

//        StringBuffer sbuf4 = new StringBuffer("Pramod");


        StringBuilder sb3 = new StringBuilder("Kristen");
        sb3.append(" Jones");
        System.out.println(sb3);


        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);


    }
}

