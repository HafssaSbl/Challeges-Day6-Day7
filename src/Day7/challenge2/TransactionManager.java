package Day7.challenge2;

import java.util.ArrayList;

public class TransactionManager {
    public ArrayList<BankAccount> bankAccounts = new ArrayList<>();
    public ArrayList<Transaction> transactions = new ArrayList<>();


    public void displayInfoHistory() {
        for (Transaction transaction : transactions){
            System.out.println(transaction);
        }
    }
     // Stream() : recuperer tout datas
    // anyMarch
    // lambda fonction ou bien row fonction
    public void addAcount(BankAccount account){
        bankAccounts.add(account);
    }
    public void diposit(BankAccount account, double amount) throws Exception {
        account.deposit(amount);
        transactions.add(new Transaction("diposit",amount));

    }
    public void withdrawal(BankAccount account, double amount){
        account.withdraw(amount);
        transactions.add(new Transaction("withdrawal",amount));
    }
    public void displayInfo(BankAccount account){
            System.out.println(account.numberAccount + "   " + account.balance);
    }

    public void trasfert(BankAccount bankAccountDepited, BankAccount bankAccountCredited, Double amount) throws ClassNotFoundException{

        if (!bankAccounts.stream()
                .anyMatch(e -> e == bankAccountDepited)) {
            throw new ClassNotFoundException("hana");
        }else {
            bankAccountDepited.balance -= amount;
        }
        if (!bankAccounts.stream()
                .anyMatch(e -> e == bankAccountCredited)) {
            throw new ClassNotFoundException("hana");
        }else {
            bankAccountCredited.balance += amount;
        }



    }

}
