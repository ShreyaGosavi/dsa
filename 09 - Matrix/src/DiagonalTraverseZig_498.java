public class DiagonalTraverseZig_498 {
    public int[] findDiagonalOrder(int[][] mat) {
        int[] ans = new int[mat[0].length * mat.length];
        int nr = mat.length;
        int nc = mat[0].length;
        int row = 0;
        int col = 0;

        for(int i = 0; i < ans.length; i++){
            ans[i] = mat[row][col];

            if((row + col) % 2 == 0){ //moving up

                if(col == nc - 1){
                    row++;
                }
                else if(row == 0){
                    col++;
                }
                else{
                    row--;
                    col++;
                }
            }
            else{ //moving downward

                if(row == nr - 1){
                    col++;
                }
                else if(col == 0){
                    row++;
                }
                else{
                    col--;
                    row++;
                }
            }
        }
        return ans;
    }
}
