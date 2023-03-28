package tpJenkins.exercice2;

public class Account {

    private int accountId;
    private double balance;
    private double interestRate;

    public Account(int accountId, double balance, double interestRate) {
        this.accountId = accountId;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public int getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            throw new IllegalArgumentException("Not enough balance");
        }
        balance -= amount;
    }

    public void transfer(Account toAccount, double amount) {
        withdraw(amount);
        toAccount.deposit(amount);
    }

    public double calculateInterest() {
        return balance * interestRate;
    }
}