package WorkingAbstractionExe.Jedi;

public class MakeMatrix {
    private int row;
    private int col;

    public MakeMatrix(int row, int col) {
        this.row = row;
        this.col = col;
    }
    public int[][] makeMatrix(){
        int[][] matrix = new int[row][col];
        int num =0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=num++;
            }
        }
        return matrix;
    }
}
