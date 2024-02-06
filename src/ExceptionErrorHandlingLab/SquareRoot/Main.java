package ExceptionErrorHandlingLab.SquareRoot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            String input = scanner.nextLine();
            double value = Double.parseDouble(input);
            System.out.printf("%.2f\n",calcSqrt(value));
        }catch (NumberFormatException ex){
            System.out.println("Invalid");
        }catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Goodbye");
        }

    }

    private static double calcSqrt(double value){
       if(value<0)
           throw new ArithmeticException("Invalid");
       return Math.sqrt(value);
    }
}
