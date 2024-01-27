package src.basics;

public class Lab131 {
    public static void main(String[] args) {

        String s1 = "Kristen";
        String s2 = new String("Kristen");
        String s3 = new String("kristen");
        System.out.println(s1 == s2);//this will be false because the reference area is different.
                                    // == the double equal checks for references
        System.out.println(s1.equals(s2));//this will be true because the content is the same
                                            //the equal method compares the actual content


        System.out.println(s1.equalsIgnoreCase(s3));//This is true because of the case sensitivity being ignored
        System.out.println(s1.equals(s3));//this is not true because JAVA is considering the case sensitivity

    }
}