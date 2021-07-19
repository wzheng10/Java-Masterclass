package masterclass.udemy;

public class Main {

    public static void main(String[] args) {
        BankAccount bobsAccount = new BankAccount();
//        BankAccount bobsAccount = new BankAccount("12345", 0.00, "Bob Brown", "myemail@bob.com", "(123) 123-3213");
//        bobsAccount.setAccountNumber("12345");
//        bobsAccount.setBalance(0.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setEmail("myemail@bob.com");
//        bobsAccount.setPhoneNumber("(123) 123-3213");

        /////////////////////////////////////////////////////
//        System.out.println(bobsAccount.getAccountNumber());
//        System.out.println(bobsAccount.getBalance());
//
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(50);
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(51);
//        bobsAccount.withdrawal(100.0);
//        System.out.println(bobsAccount.getBalance());
//
//        BankAccount timsBankAccount = new BankAccount("Tim", "tim@email.com", "12345");
//        System.out.println(timsBankAccount.getPhoneNumber() + " name " + timsBankAccount.getCustomerName());

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 25000.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Wei", 100.00, "wei@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }
}
