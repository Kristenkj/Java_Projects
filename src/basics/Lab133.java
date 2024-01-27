package src.basics;

public class Lab133 {
    public static void main(String[] args) {

        // Immutable in nature (that can't changed)
        String password = "pass@123";

        // 1000 times I am going to change the password value
        // should I use the Sb, sb OR String

        // Mutable - that can be changed!!
        StringBuilder password2 = new StringBuilder("Brianna");
        password2.append("Jones");
        System.out.println(password2);


    }
}
