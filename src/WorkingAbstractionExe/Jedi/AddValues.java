package WorkingAbstractionExe.Jedi;

public class AddValues {
    private int row;
    private int col;

    public AddValues(int row, int col) {
        this.row = row;
        this.col = col;
    }
    public int add(int[][] matrix){
        int sum=0;
        while(row>=0 && col<matrix[1].length){
            if(row>=0 && row<matrix.length && col>=0 && col<matrix[0].length)
                sum+=matrix[row][col];
            row--;
            col++;
        }
        return sum;
    }
}
