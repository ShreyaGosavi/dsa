public class DivisorGame {
    public static void main(String[] args){
        System.out.println(divisorGame(4));
    }

    public static boolean divisorGame(int n) {
        return helper(n, true);
    }

    public static boolean helper(int n, boolean turn){
        if(n < 0){
            return false;
        }

        int x = chooseX(n);
        if(x != -1){
            return helper(n-x, !turn);
        }
        if(turn){
            return false;
        }
        return true;
    }


    public static int chooseX(int n){
        for(int i = n-1; i > 0; i--){
            if(n % i == 0){
                return i;
            }
        }
        return -1;
    }
}
