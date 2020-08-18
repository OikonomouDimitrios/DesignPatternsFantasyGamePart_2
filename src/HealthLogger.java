public class HealthLogger implements HealthObserver {
    private int health;
    private HealthSubject enemy;


    @Override
    public void update(int health) {
        setHealth(health);
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
        printHealth();
    }

    public HealthLogger(HealthSubject newEnemy) {
        enemy = newEnemy;
        enemy.register(this);
    }

    public int getHealth() {
        return health;
    }

    public void printHealth() {
        System.out.println("* Enemy health points set to " + getHealth());
    }


}
