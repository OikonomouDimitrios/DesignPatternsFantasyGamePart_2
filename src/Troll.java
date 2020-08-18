public class Troll extends AbstractEnemy {
    private static final int baseHP = 100;

    @Override
    public int getBaseAttack() {
        return 10;
    }

    @Override
    public void attack() {
        System.out.println(getEnemyName() + " attacks for " + getEnemyState().attack());
    }

    @Override
    public void takeDamage(int DamageTaken) {
        setHP(getHP() - DamageTaken);
        defineEnemyState();
    }


    public void setHP(int hp) {
        HP = hp;
        notifyObserver();
    }

    public Troll(String newName) {
        super(newName);
        setHP(baseHP);
        setEnemyState(Normal);
    }

    @Override
    public void defineEnemyState() {
        if (getHP() > 10 && getHP() < 100 && Math.random() <= 0.3) {
            setEnemyState(Enraged);
        } else if (getHP() < 10) {
            setEnemyState(Afraid);
        }
    }

    public void printEnemyState() {
        System.out.println(getEnemyName() + " is " + getEnemyState().getName());
    }


}
