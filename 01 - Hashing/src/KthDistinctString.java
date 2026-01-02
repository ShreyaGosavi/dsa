import java.util.HashMap;

public class KthDistinctString {
    public static void main(String[] args){
        String[] arr = {"aaa","aa","a"};
        System.out.println(kthDistinct(arr, 1));
    }

    public static String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> freq = new HashMap<>();

        for (String s : arr) {
            freq.put(s, freq.getOrDefault(s, 0) + 1);
        }

        int count = 0;
        for (String s : arr) {
            if (freq.get(s) == 1) {
                count += 1;

                if (count == k) {
                    return s;
                }
            }
        }
        return "";
    }
}
