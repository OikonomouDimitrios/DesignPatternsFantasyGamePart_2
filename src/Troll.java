public class Troll extends AbstractEnemy {
    private int HP;
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
        HP = HP - DamageTaken;
        System.out.println(getEnemyName() + " health points set to " + getHP());
        defineEnemyState();


    }

    public int getHP() {
        return HP;
    }

    public void setHP() {
        HP = baseHP;
    }

    public Troll(String newName) {
        super(newName);
        setHP();
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
