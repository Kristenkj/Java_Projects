package src.oops.oops_14thJan_2024.innerclass;

public class Lab156 {
    public static void main(String[] args) {

        Thread t=  new Thread(){
            @Override
            public void run(){
                System.out.println("I am a THREAD!");
            }
        };
        t.run();


    }
}
