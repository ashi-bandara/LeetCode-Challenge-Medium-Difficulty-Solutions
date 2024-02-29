import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        List<Integer> fullList = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                fullList.add(matrix[i][j]);
            }
        }

        Collections.sort(fullList);

        return fullList.get(k-1);
    }
}