public class TransPoseMatrix_867 {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix[0].length;
        int cols = matrix.length;

        int[][] ans = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
}
