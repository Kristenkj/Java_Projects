package src.oops.o07_Dec.Notes;

public class Lab127 {
    public static void main(String[] args) {
        //Reverse name
        String name = "Kristen"; // (left) K r i s t e n (right)
        //                          0 1 2 3 4 5 6 - indexes
        char [] charArray =  name.toCharArray();
        System.out.println(charArray.length);

        // o/p -> netsirK

        int left = 0;
        int right = charArray.length-1;

        while(left < right){
            char temp = charArray[left];
            charArray[left] = charArray[right];//swapping characters
            charArray[right] = temp;

            left++;
            right--;
        }

        String rev_name = new String(charArray);
        System.out.println(rev_name);





    }
}
