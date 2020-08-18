import java.util.ArrayList;

public abstract class AbstractEnemy implements HealthSubject {
    protected EnemyAttack Normal;
    protected EnemyAttack Enraged;
    protected EnemyAttack Afraid;
    protected int HP;

    private EnemyAttack enemyState;
    private String name;
    private ArrayList<HealthObserver> observers;

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
        observers = new ArrayList<>();

    }

    public int getHP() {
        return HP;
    }

    public abstract void defineEnemyState();

    @Override
    public void register(HealthObserver o) {
        observers.add(o);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(e -> e.update(getHP()));
    }
}
