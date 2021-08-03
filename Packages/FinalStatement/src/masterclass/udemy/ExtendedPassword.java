package masterclass.udemy;

public class ExtendedPassword  extends Password{

    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

    @Override   //final prevents this override from working
    public void storePassword() {
        System.out.println("Saving password as " + this.decryptedPassword);
    }
}
