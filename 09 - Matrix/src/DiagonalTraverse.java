public class DiagonalTraverse {
    public int[] diagonal(int[][] mat){
        int[] ans = new int[mat[0].length * mat.length];
        int index = 0;

        //starting from the column
        for(int col = 0; col < mat[0].length; col++){
            int row = 0;
            int j = col;

            while(row < mat.length && j >= 0){
                ans[index] = mat[row][col];
                index++;
                row++;
                j--;
            }
        }

        //starting from the last column
        for(int k = 1; k < mat.length; k++){
            int col = mat[0].length;
            int row = 1;

            while(row < mat.length && col >= 0){
                ans[index] = mat[row][col];
                index++;
                col--;
                row++;
            }
        }

        return ans;
    }
}
