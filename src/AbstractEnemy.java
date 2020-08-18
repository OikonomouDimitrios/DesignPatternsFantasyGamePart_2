public abstract class AbstractEnemy {
    protected EnemyAttack Normal;
    protected EnemyAttack Enraged;
    protected EnemyAttack Afraid;
    private EnemyAttack enemyState;
    private String name;

    public abstract int getBaseAttack();

    public abstract void attack();

    public abstract void takeDamage(int DamageTaken);

    public void setEnemyState(EnemyAttack newEnemyState) {
        enemyState = newEnemyState;
    }

    public String getEnemyName() {
        return name;
    }

    public EnemyAttack getEnemyState() {
        return enemyState;
    }

    public AbstractEnemy(String newName) {
        name = newName;
        Normal = new Normal(this);
        Enraged = new Enraged(this);
        Afraid = new Afraid(this);

    }

    public abstract void defineEnemyState();

}
