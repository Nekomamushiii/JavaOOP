package WorkingAbstractionExe.Jedi;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rowCol = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        MakeMatrix makeMatrix = new MakeMatrix(rowCol[0],rowCol[1]);
        int[][] matrix = makeMatrix.makeMatrix();

        String command = scanner.nextLine();
        int sum=0;
        while (!command.equals("Let the Force be with you"))
        {

            int[] ivoS = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] evil = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Evil0 evil0 = new Evil0(evil[0],evil[1]);
            matrix=evil0.changeMatrix(matrix);

            AddValues addValues = new AddValues(ivoS[0],ivoS[1]);
            sum += addValues.add(matrix);

            command = scanner.nextLine();
        }

        System.out.println(sum);

    }
}
