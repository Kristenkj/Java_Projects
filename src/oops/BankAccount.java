package src.oops;

public class BankAccount {

    String bankName;
    int balance;

    String bankCode;

    BankAccount(){
        bankName = "Bank Demo Name";
        System.out.println("Default C");
    }

    BankAccount(String bName, String bCode){
        this.bankName = bName;//If the 'this' keyword isn't used the default value will be assigned
        this.bankCode = bCode;
        System.out.println("Param C");
    }
    void  printDetails(){
        System.out.println(" Bank Name -->" + this.bankName);
        System.out.println(" Bank Code -->" + this.bankCode);
        System.out.println(" Balance -->" + balance);
    }
}
