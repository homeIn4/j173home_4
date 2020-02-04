package home0204.yangchunlei.factory;

public class HeroTwoFactory extends HeroFactory{
    @Override
    public Hero madeHero() {
        HeroTwo heroTwo = new HeroTwo();
        heroTwo.setName("heroTwo");
        heroTwo.setAttack("攻击力1000");
        return heroTwo;
    }
}
