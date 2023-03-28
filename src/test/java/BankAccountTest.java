import main.java.org.tpJenkins.exercice2.Account;
import main.java.org.tpJenkins.exercice2.Bank;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class BankAccountTest {

    @Test
    public void testDeposit() {
        Account a = new Account(1,12,14);
        a.deposit(3);
        assertEquals(15.0, a.getBalance());
    }

    @Test
    public void testWithdraw() {
        Account a = new Account(1,12,14);
        a.withdraw(2);
        assertEquals(10.0, a.getBalance());
    }

    @Test
    public void testTransferAToA() {
        Account a1 = new Account(1,12,14);
        Account a2 = new Account(2,150,5);
        a1.transfer(a2, 2);
        assertEquals(10.0, a1.getBalance());
        assertEquals(152.0, a2.getBalance());
    }
    @Test
    public void testAddAccount() {
        Bank b = new Bank();
        Account a = new Account(1,0,0);
        b.addAccount(a);
        assertEquals(a, b.getAccount(a.getAccountId()));
    }
    @Test
    public void testRemoveAccount() {
        Bank b = new Bank();
        Account a = new Account(1,0,0);
        b.addAccount(a);
        b.removeAccount(a);
        assertEquals(null, b.getAccount(a.getAccountId()));
    }
    @Test
    public void testTransferBtoA() {
        Bank b = new Bank();
        Account a1 = new Account(1,5,0);
        Account a2 = new Account(2,5,5);
        b.addAccount(a1);
        b.addAccount(a2);
        b.transferMoney(a1, a2, 5);
        assertEquals(0.0, a1.getBalance());
        assertEquals(10.0, a2.getBalance());
    }
}
