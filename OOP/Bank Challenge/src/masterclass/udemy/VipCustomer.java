package masterclass.udemy;

public class VipCustomer {

    public String name;
    public double creditLimit;
    public String emailAddress;

    public VipCustomer() {
        this("Default Name", 10000, "customerEmail@Address.com");
        System.out.println("First Constructor");
    }
    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
        System.out.println("Second Constructor");
    }
    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        System.out.println("Third Constructor");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
