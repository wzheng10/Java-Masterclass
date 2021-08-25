package masterclass.udemy;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Account {

    private double balance;
    private String accountNumber;

    private Lock lock;


    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.lock = new ReentrantLock();
    }

    public synchronized boolean deposit(double amount) {

        boolean status = false;
        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                try {
                    balance += amount;
                    status = true;
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Could not get the lock");
            }
        }catch(InterruptedException e) {
            //do something
        }

        System.out.println("Transaction status = " + status);
        return status;
    }

    public synchronized void withdraw(double amount) {

        boolean status = false;
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    balance -= amount;
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Could not get the lock");
            }
        } catch(InterruptedException e){
            System.out.println("Could not get lock");
        }
        System.out.println("Transaction status = " + status);

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void printAccountNumber() {
        System.out.println("Account number =" + accountNumber);
    }
}