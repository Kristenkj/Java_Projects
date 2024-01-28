package src.oops;

public class Lab148 {
    public static void main(String[] args) {

        BlocksClass blocksClass = new BlocksClass();//If no object is created. No IIB/DC will be called. Nothing will happen
        new BlocksClass();//SIB
        BlocksClass b = null;
        b = new BlocksClass();
    }





}
