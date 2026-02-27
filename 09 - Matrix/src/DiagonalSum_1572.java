public class DiagonalSum_1572 {
    public static int diagonalSum(int[][] mat) {
        int ans = 0;

        int row = 0;
        int col = 0;

        //starts from the (0, 0)
        while(row < mat.length && col < mat.length){
            ans += mat[row][col];
            row++;
            col++;
        }

        row = 0;
        col = mat.length -1;

        //starts from the (0, 3)
        while(row < mat.length && col >= 0){
            if(row != col){
                ans += mat[row][col];
            }
            row++;
            col--;
        }
        return ans;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int result = diagonalSum(matrix);

        System.out.println("Diagonal Sum: " + result);
    }
}
//ch   ie   pr