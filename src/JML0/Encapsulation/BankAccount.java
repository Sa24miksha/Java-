package JML0.Encapsulation;

public class BankAccount {
    private long accountNumber;
    private double balance;

    public void  Deposite(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Account balance:" + " " + balance);
        } else{
            System.out.println("Invalid deposited amount");
        }
    }

    public void Withdraw(double amount){
        if(amount > 0 && amount < balance){
            amount -= balance;
            System.out.println("Withdrew: " + " " + balance);
        } else{
            System.out.println("Insufficient balance!");
        }
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
