public class Hero {
    private int heroHealth;
    private int heroAttack;
    private String heroSuperAbility;

    public Hero(int heroHealth, int heroAttack, String heroSuperAbility) {
        this.heroHealth = heroHealth;
        this.heroAttack = heroAttack;
        this.heroSuperAbility = heroSuperAbility;
    }

    public Hero(int heroHealth, int heroAttack) {
        this.heroHealth = heroHealth;
        this.heroAttack = heroAttack;
        this.heroSuperAbility = "Нет суперспособности";
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public int getHeroAttack() {
        return heroAttack;
    }

    public String getHeroSuperAbility() {
        return heroSuperAbility;
    }
}