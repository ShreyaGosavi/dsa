public class Rotate90_48 {
    public void rotate(int[][] matrix) {
        //step 1: transpose
        for(int i = 0; i < matrix[0].length; i++){
            for(int j = i + 1; j < matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //step 2: column swaps
        int start = 0;
        int end = matrix.length - 1;

        while(start < end){
            for(int i = 0; i < matrix.length; i++){
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
            }
            start++;
            end--;
        }
    }
}
