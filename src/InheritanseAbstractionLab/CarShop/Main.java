package InheritanseAbstractionLab.CarShop;

public class Main {
    public static void main(String[] args) {
        Seat seat = new Seat("Leon","gray",110,"Spain");
        System.out.println(String.format("%s is %s color and have %d horse power\n",
                seat.getModel(),
                seat.getColor(),
                seat.getHorsePower()));
        System.out.println(seat.toString());
    }
}
