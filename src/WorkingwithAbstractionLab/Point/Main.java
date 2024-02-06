package WorkingwithAbstractionLab.Point;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int bottomLeftX = Integer.parseInt(input[0]);
        int bottomLeftY = Integer.parseInt(input[1]);
        int topRightX = Integer.parseInt(input[2]);
        int topRightY = Integer.parseInt(input[3]);
        Point point1 = new Point(bottomLeftX,bottomLeftY);
        Point point2 = new Point(topRightX,topRightY);
        Rectangle rectangle = new Rectangle(point1,point2);

        int n = Integer.parseInt(scanner.nextLine());
        for(int i=0;i<n;i++){
            String[] coordinates = scanner.nextLine().split("\\s+");
            int x = Integer.parseInt(coordinates[0]);
            int y = Integer.parseInt(coordinates[1]);
            Point point = new Point(x,y);

            System.out.println(rectangle.contains(point));
        }
    }
}
