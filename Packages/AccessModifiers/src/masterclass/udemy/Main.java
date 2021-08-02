package masterclass.udemy;

public class Main {

    public static void main(String[] args) {
        Account weisAccount = new Account("Wei");
        weisAccount.deposit(1000);
        weisAccount.withdraw(500);
        weisAccount.withdraw(-200);
        weisAccount.deposit(-20);
        weisAccount.calculateBalance();
        weisAccount.balance = 5000;//only works when the fields are public
        System.out.println("====================================================");
        System.out.println("Balance on account is " + weisAccount.getBalance());
        weisAccount.transactions.add(4500); //only works when the fields are public
        weisAccount.calculateBalance();
    }
}
