package tpJenkins.exercice2;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public void displayAllBalances() {
        for (Account account : accounts) {
            System.out.println(account.getBalance());
        }
    }

    public void transferMoney(Account fromAccount, Account toAccount, double amount) {
        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
    }

    public Account getAccount(int accountId) {
        for (Account account : accounts) {
            if (account.getAccountId() == accountId) {
                return account;
            }
        }
        return null;
    }
}


