package src.basics;

public class Lab130 {
    public static void main(String[] args) {

        String name = "Kristen";
        System.out.println(name.concat(" Jones"));
        System.out.println(name + " Jones");
        System.out.println(name.contains("p"));
        System.out.println(name);


        String name2 = new String("Jones");


        String expected_result = "password@123";
        String actual_result = "Password@123";
        if (expected_result.equalsIgnoreCase(actual_result)) { //Use this function to cancel out case sensitivity
            System.out.println("Yes");
        }

    }
}
