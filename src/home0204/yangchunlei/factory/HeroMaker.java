package home0204.yangchunlei.factory;

public class HeroMaker {
    public static  Hero madeHero(String tag){
        switch (tag){
            case "heroOne":
                HeroOne heroOne = new HeroOne();
                heroOne.setName("heroOne");
                heroOne.setAttack("攻击力100");
                return heroOne;
            default:
                return null;
        }
    }
}
