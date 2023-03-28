import bank.Account;

public class TestAccount {
    public static void main(String[] args) {
        Account account1 = new Account("John", 1000, 0.5);
        Account account2 = new Account("Jane", 2000, 0.5);
        account1.transfert(account2, 500);
        System.out.println(account1);
        System.out.println(account2);
    }

}
