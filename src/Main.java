public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHealth(450);
        boss.setBossAttack(45);
        boss.setBossSheild("Kinetic");

        System.out.println("Boss info:");
        System.out.println("Boss health: " + boss.getBossHealth());
        System.out.println("Boss attack: " + boss.getBossAttack());
        System.out.println("Boss shield: " + boss.getBossSheild());

        Hero[] heroes = createHeroes();

        System.out.println("\nHeroes info:");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHeroHealth());
            System.out.println("Damage: " + hero.getHeroAttack());
            System.out.println("Superpower: " + hero.getHeroSuperAbility());
            System.out.println();
        }
    }

    public static Hero[] createHeroes() {
        Hero hero = new Hero(145, 54, "Fire");
        Hero heroOne = new Hero(145, 55); 
        Hero heroTwo = new Hero(100, 30, "Water");

        return new Hero[]{hero, heroOne, heroTwo};
    }
}
