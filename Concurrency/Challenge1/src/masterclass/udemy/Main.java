package masterclass.udemy;

public class Main {

    public static void main(String[] args) {
        final Account account = new Account("12345-678", 1000);

//        Thread trThread1 = new Thread() {
//            public void run() {
//                bankAccount.deposit(300);
//                bankAccount.withdraw(50);
//            }
//        };
//        Thread trThread2 = new Thread() {
//            public void run() {
//                bankAccount.deposit(203.65);
//                bankAccount.withdraw(100);
//            }
//        };

        Thread trThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(300);
                account.withdraw(50);
                System.out.println("Transaction completed for account " + account.getAccountNumber());
            }
        });
        Thread trThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(203.65);
                account.withdraw(100);
                System.out.println("Transaction completed for account " + account.getAccountNumber());
            }
        });

        trThread1.start();
        trThread2.start();

    }
}
