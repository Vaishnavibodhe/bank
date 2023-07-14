package BankingSystem;

public interface RBIBankInterface{
    String depositMoney(int money);

    String withdrawMoney(int money,String password);

    String checkBalance(String password);

    Double calculateTotalInterest(int time);
}
