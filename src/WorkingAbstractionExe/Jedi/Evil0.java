package WorkingAbstractionExe.Jedi;

public class Evil0 {
    private int row;
    private int col;


    public Evil0(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int[][] changeMatrix(int[][] matrix){
        while (row>=0 && col>=0){
            if(row>=0 && row< matrix.length && col>=0 && col < matrix[0].length)
                matrix[row][col]=0;
            row--;
            col--;
        }
        return matrix;
    }
}
