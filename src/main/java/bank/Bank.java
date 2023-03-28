package bank;

public class Bank {
    private String name;
    private Account[] accounts;

    public Bank(String name, Account[] accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        Account[] newAccounts = new Account[accounts.length + 1];
        for (int i = 0; i < accounts.length; i++) {
            newAccounts[i] = accounts[i];
        }
        newAccounts[accounts.length] = account;
        accounts = newAccounts;
    }

    public void removeAccount(Account account) {
        Account[] newAccounts = new Account[accounts.length - 1];
        int j = 0;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != account) {
                newAccounts[j] = accounts[i];
                j++;
            }
        }
        accounts = newAccounts;
    }

    public double getTotalBalance() {
        double totalBalance = 0;
        for (int i = 0; i < accounts.length; i++) {
            totalBalance += accounts[i].getBalance();
        }
        return totalBalance;
    }

    public double getTotalInterest() {
        double totalInterest = 0;
        for (int i = 0; i < accounts.length; i++) {
            totalInterest += accounts[i].getBalance() * accounts[i].getInterestRate();
        }
        return totalInterest;
    }

    public void transfer(Account account1, Account account2, double amount) {
        account1.withdraw(amount);
        account2.deposit(amount);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", accounts=" + accounts +
                '}';
    }

}
