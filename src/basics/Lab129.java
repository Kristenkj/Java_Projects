package src.basics;

public class Lab129 {
    public static void main(String[] args) {
        //Displaying immutability - original string will remain unchanged
        String name = "Kristen";// String constant pool
        String name2 = new String("Kristen");//Object area

        name = "Jones";

        String str1 = "Hello";
        String str2 = str1.concat(" World");//A new string is created
        String str3 = "World";
        System.out.println(str2);
        System.out.println(str1);
        System.out.println(str3);

        str1 = str1.concat(" World");//str1 points to new pool but the original still exists
        str2 = "Hello";//This now points to the original pool that was created with str1 because the connection was
                      //severed with the original variable tr1. Also, no longer point to original concat
        System.out.println(str1);
        System.out.println(str2);


    }

}
