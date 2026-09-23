import java.util.ArrayList;
//opgave 3
public class BankAccount {

    private String owner;
    private double balance;
    private ArrayList<Transaction> transactions;

    public BankAccount(String owner, double startBalance){
        this.owner = owner;
        this.balance = startBalance;
        transactions = new ArrayList<>();
    }

    public void deposit(double amount){
        balance += amount;
        transactions.add(new Transaction("deposit", amount));
        System.out.println("Deposited " + amount + " money.");
    }

    public void withdraw(double amount){
        if (balance > 0 && amount < balance){
            balance -= amount;
            transactions.add(new Transaction("withdraw", amount));
            System.out.println("Withdrew " + amount + " money.");
        } else {
            System.out.println("Not enough money!");
        }
    }

    public void printTransactionHistory(){
        for (Transaction t : transactions){
            System.out.println(t.toString());
        }
    }

    public double getBalance(){
        return balance;
    }

    public void printAccount(){
        System.out.println("Owner: " + owner);
        System.out.println("Balance: " + getBalance());
        System.out.println("History: ");
        printTransactionHistory();
    }


}
