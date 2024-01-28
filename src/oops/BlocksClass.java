package src.oops;

public class BlocksClass {

    {
        System.out.println("I am IIB");//Instance initialization block
    }

    BlocksClass(){
        System.out.println(" I am DC");//Default constructor
    }


    static { // SIB Static Initialization Block
        System.out.println("I am SIB");
    }


}
