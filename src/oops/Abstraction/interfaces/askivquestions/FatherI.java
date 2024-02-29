package src.oops.Abstraction.interfaces.askivquestions;

interface FatherI{

    void load1k();

    default void print(){
        System.out.println(" I am a default method");
    }
    public static void print2(){
        System.out.println("I am a static Method");
    }
}
