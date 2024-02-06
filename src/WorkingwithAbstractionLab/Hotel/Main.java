package WorkingwithAbstractionLab.Hotel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] data = scanner.nextLine().split("\\s+");
        System.out.printf("%.2f",PriceCalculator.calculate(Double.parseDouble(data[0]),Integer.parseInt(data[1]),Season.valueOf(data[2]),Discount.valueOf(data[3])));
    }
}
