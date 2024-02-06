package restaurant.needForSpeed;

public class Main {
    public static void main(String[] args) {
        RaceMotorcycle raceMotorcycle=new RaceMotorcycle(100,100);

        System.out.println(raceMotorcycle.getFuel());
        System.out.println(raceMotorcycle.getFuelConsumption());
        System.out.println(raceMotorcycle.getHorsePower());
        raceMotorcycle.drive(4);
        System.out.println();
        System.out.println(raceMotorcycle.getFuel());
        System.out.println(raceMotorcycle.getFuelConsumption());
        System.out.println(raceMotorcycle.getHorsePower());
    }
}
