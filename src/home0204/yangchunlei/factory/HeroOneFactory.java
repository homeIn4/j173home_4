package home0204.yangchunlei.factory;

public class HeroOneFactory extends HeroFactory{
    @Override
    public Hero madeHero() {
        HeroOne one = new HeroOne();
        one.setName("英雄一");
        one.setAttack("攻击力100");
        return one;
    }
}
