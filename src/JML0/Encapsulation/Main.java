package JML0.Encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(123456);
        bankAccount.setBalance(1000);
        bankAccount.Deposite(600);
        bankAccount.Withdraw(100);
    }
}
