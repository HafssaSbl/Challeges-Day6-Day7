package Day7.challenge2;

import java.util.ArrayList;

public abstract class BankAccount implements Transactable{

    public String numberAccount;
    public double balance;

    public ArrayList<TransactionType> transactionTypes;
    public BankAccount(String numberAccount, double balance) {
        this.numberAccount = numberAccount;
        this.balance = balance;
    }


    public void deposit(double amount) throws Exception {
        if (amount>0) balance+=amount;
        else{
            System.err.println("Error");
            throw new Exception("Invalide ");
        }


    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.err.println("Insufficient funds");
        }
    }

}
