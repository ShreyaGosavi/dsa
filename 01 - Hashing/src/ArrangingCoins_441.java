public class ArrangingCoins_441 {
    public static void main(String[] args){

    }

    public static int arrangeCoins(int n) {
        if (n == 0 || n == 1){
            return n;

        }
        int i = 1;
        long sum = 0;
        //sum = sum+i;
        while(sum <= n){
            sum += i;
            i++;
        }
        return i - 2;
    }
}
