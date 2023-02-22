package originals;

public class Player {

    private String name;
    private int healthScore;
    private String weapon;

    public void loseHealth(int damage) {
        healthScore = healthScore - damage;
        if (healthScore <= 0) {
            System.out.println("player knocked out of game");
        }
    }

    public int healthRemaining() {
        return healthScore;
    }

    public void restoreHealth(int extraHealth) {
        healthScore = healthScore + extraHealth;
        if (healthScore > 100) {
            System.out.println("originals.Player restored to 100");
            healthScore = 100;
        }
    }
}
