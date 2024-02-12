import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> rows = new ArrayList<>(); // to store the row number of zero element
        List<Integer> columns = new ArrayList<>(); // to store the column number of zero element

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0){
                    rows.add(i);
                    columns.add(j);
                }
            }
        }

        for (Integer row : rows) {
            setRowZero(matrix, row);
        }

        for (Integer column : columns) {
            setColumnZero(matrix, column);
        }
    }

    public void setColumnZero(int[][] mat, int col){
        for (int i = 0; i < mat.length; i++) {
            mat[i][col] = 0;
        }
    }

    public void setRowZero(int[][] mat, int row){
        Arrays.fill(mat[row], 0);
    }
}