public class JumpingGeek_gfg {
    public static String jumpingGeek(int N) {
        return helper(0, 1, N);

    }

    public static String helper(int num, int add, int n) {
        if (num == n) {
            return "yes";
        }
        if (num > n) {
            return "no";
        }

        num += add;
        add = (add == 3) ? 1 : add + 1;

        return helper(num, add, n);
    }
}
