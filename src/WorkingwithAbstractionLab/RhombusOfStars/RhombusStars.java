package WorkingwithAbstractionLab.RhombusOfStars;

import java.util.Scanner;

public class RhombusStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++){
            printRow(i,n);
        }
        for(int i=n-1;i>=1;i--){
            printRow(i,n);
        }
    }
    public static void printRow(int i,int n) {
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
