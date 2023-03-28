package bank;

public class Account {
    private String name;
    private double solde;
    private double interestRate;

    public Account(String name, double solde, double interestRate) {
        this.name = name;
        this.solde = solde;
        this.interestRate=interestRate;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return solde;
    }


    public void deposit(double amount) {
        this.solde += amount;
    }

    public void withdraw(double amount) {
        this.solde -= amount;
    }

    public double getInterestRate() {
        return interestRate;
    }
    public void transfert(Account account, double amount){
        this.withdraw(amount);
        account.deposit(amount);
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + solde +
                ", interestRate=" + interestRate +
                '}';
    }
}
