package masterclass.udemy;

import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;
    private static int count;

    @org.junit.BeforeClass
    public static void beforeClass() {
        System.out.println("This executes before any test cases. Count = " + count++);
    }
    @org.junit.Before
    public void setup() {
        account = new BankAccount("Wei", "Zheng", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }

    @org.junit.Test
    public void deposit() {
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
    }

    @org.junit.Test
    public void withdraw_branch() throws Exception {
        double balance = account.withdraw(600.00, true);
        assertEquals(400.00, balance, 0);
    }

    @org.junit.Test (expected = IllegalArgumentException.class)
    public void withdrawal_notBranch() throws Exception {
        double balance = account.withdraw(600.00, false);
        fail("Should have thrown IllegalArgumentException");
    }
    //old way
//    @org.junit.Test
//    public void withdrawal_notBranch() throws Exception {
//        try {
//            account.withdraw(600.00, true);
//            fail("Should have thrown IllegalArgumentException");
//        } catch (IllegalArgumentException e) {
//        }
//    }

    @org.junit.Test
    public void getBalance_deposit() throws Exception {
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdrawal() throws Exception {
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_true() {
        assertTrue("The account is NOT a checking account",account.isChecking());
    }

    @org.junit.AfterClass
    public static void afterClass() {
        System.out.println("This executes after any test cases. Count = " + count++);
    }

    @org.junit.After
    public void teardown() {
        System.out.println("Count = " + count++);
    }
}