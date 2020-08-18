import java.util.Random;

public class DesignPatternsFantasyGamePart_2 {
    public static void main(String[] args) {
        var enemy = new Troll("Troll");
        while (enemy.getHP() > 0) {
            enemy.printEnemyState();
            enemy.attack();
            enemy.takeDamage(getRandomDamage());
            if (enemy.getHP() <= 0) {
                System.out.println("enemy is dead");
            }
        }

    }

    public static int getRandomDamage() {
        return new Random().nextInt(25) + 10;
    }
}
