package src.oops;

public class Lab141 {
    public static void main(String[] args) {
        BankAccount bankdefault = new BankAccount();//Uses the default constructor
        bankdefault.printDetails();

        System.out.println("---------------------------");

        BankAccount PinnacleBank = new BankAccount("Pinnacle", "pb0089");//Uses the param constructor
        PinnacleBank.printDetails();

        System.out.println("---------------------------");

        BankAccount NVF = new BankAccount("NVF", "nvf8975");//Uses the param constructor
        NVF.printDetails();

        }
    }
