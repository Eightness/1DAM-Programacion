public class Enemy {

    //Class Atributes
    private String enemyName;
    private int health;
    private int attackDamage;

    //---------------------------------------------------------------------------

    //Constructor
    public Enemy(String enemyName) {
        this.enemyName = enemyName;
        this.health = 100;
        this.attackDamage = 10;
    }

    //---------------------------------------------------------------------------

    //Functions

    //Function to show enemy attributes
    public void showEnemyAttributes() {
        System.out.println("Enemy name: " + getEnemyName());
        System.out.println("Health: " + getHealth());
        System.out.println("Attack damage: " + getAttackDamage());
    }

    //---------------------------------------------------------------------------

    //Setters and Getters
    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    public String getEnemyName() {
        return this.enemyName;
    }
    
    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getAttackDamage() {
        return this.attackDamage;
    }


}
