package restaurant.hero;

public class Main {
    public static void main(String[] args) {
        Hero hero =new Hero("K",6);
        Hero museElf =new MuseElf("Nana",4);
        System.out.println(museElf);
        System.out.println(hero.getUsername());
        System.out.println(museElf.getUsername());
    }
}
