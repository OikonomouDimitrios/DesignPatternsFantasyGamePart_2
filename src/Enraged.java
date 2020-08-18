public class Enraged implements EnemyAttack {
    AbstractEnemy enemy;

    public Enraged(AbstractEnemy newEnemy) {
        enemy = newEnemy;
    }

    @Override
    public int attack() {
        return enemy.getBaseAttack() * 2;
    }

    @Override
    public String getName() {
        return "Enraged";
    }


}
