package Inheritanse.RandomList;

public class Main {
    public static void main(String[] args) {
        RandomArrayList randomArrayList = new RandomArrayList();
        randomArrayList.add("Yu bn");
        randomArrayList.add("Hello");
        randomArrayList.add("13");
        randomArrayList.add("Good morning");
        System.out.println(randomArrayList.getRandomElement());
    }
}
