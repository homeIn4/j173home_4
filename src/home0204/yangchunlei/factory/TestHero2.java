package home0204.yangchunlei.factory;

public class TestHero2 {
    public static void main(String[] args) {
        /*HeroFactory heroFactory = new HeroOneFactory();
        Hero hero = heroFactory.madeHero();
        System.out.println(hero.getName() + ":" + hero.getAttack());*/

        HeroFactory heroFactory = new HeroTwoFactory();
        Hero hero = heroFactory.madeHero();
        System.out.println(hero.getName() + ":" + hero.getAttack());
    }
}
