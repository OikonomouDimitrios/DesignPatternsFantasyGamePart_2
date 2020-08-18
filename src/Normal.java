public class Normal implements EnemyAttack {
    private String Name;
    AbstractEnemy enemy;

    public Normal(AbstractEnemy newEnemy) {
        enemy = newEnemy;
    }

    @Override
    public int attack() {
        return enemy.getBaseAttack();

    }

    @Override
    public String getName() {
        return "Normal";

    }

}
