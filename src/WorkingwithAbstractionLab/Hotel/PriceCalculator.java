package WorkingwithAbstractionLab.Hotel;

public class PriceCalculator {

    public static double calculate(double price, int day, Season season,Discount discount){
        double pri = day*price*season.getValue();
        double dis = (discount.getValue()/100.0)*pri;
        return pri-dis;
    }
}
