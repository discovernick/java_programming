package originals;

public class Encapsulation {

    public static void main(String[] args) {

        Player player = new Player();

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        player.loseHealth(11);
        System.out.println("Remaining health = " + player.healthRemaining());
    }
}
