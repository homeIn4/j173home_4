package home0204.yangchunlei.factory;

public class TestHero {
    public static void main(String[] args) {
        Hero hero =HeroMaker.madeHero("heroOne");
        System.out.println(hero.getName());
    }
}
