package BankingSystem;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    System.out.println("Hello world!");
        System.out.println("Which bank you want to open an account");
        System.out.println("Print 1 to create in Lotak and 2 to create in SBI");
    Scanner sc = new Scanner(System.in);
    int option = sc.nextInt();
        System.out.println("Enter password and initial deposit");
    String password = sc.next();
    int initialBalance = sc.nextInt();

    double account=Math.abs(Math.random()*Math.pow(10,9));
    String stringVersion = String.valueOf(account);

    RBIBankInterface bankAccount;

        if(option==1){
        bankAccount = new LotakBank(stringVersion,password,initialBalance);
    }
        else{
        bankAccount = new SBIBank(stringVersion,password,(double)initialBalance);
    }

    //Initial balance : 95000

    //Withdraw money : 70000

    String result = bankAccount.withdrawMoney(700000,"rosh123");
        System.out.println(result);

    result = bankAccount.withdrawMoney(70000,"rosh123");
        System.out.println(result);

    //Deposit money : 70000

    result =  bankAccount.depositMoney(70000);
        System.out.println(result);
        System.out.println(bankAccount.checkBalance("rosh123"));


        System.out.println(bankAccount.calculateTotalInterest(3));



  }
}
