package masterclass.udemy;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.fullName = "Wei";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        System.out.println("Player " + player.fullName);
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Reamaining Health = " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Reamaining Health = " + player.healthRemaining());
        EnhancedPlayer player = new EnhancedPlayer("Wei", 250, "Sword");
        System.out.println("Initial health is "+ player.getHitPoints());
        int damage = 50;
        player.loseHealth(damage);
        System.out.println("Remaining Health = " + player.getHitPoints());
    }
}
