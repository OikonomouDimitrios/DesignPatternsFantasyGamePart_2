public class Afraid implements EnemyAttack {
    AbstractEnemy enemy;

    public Afraid(AbstractEnemy newEnemy) {
        enemy = newEnemy;
    }

    @Override
    public int attack() {
        return enemy.getBaseAttack() / 2;
    }

    @Override
    public String getName() {
        return "Afraid";
    }
}
