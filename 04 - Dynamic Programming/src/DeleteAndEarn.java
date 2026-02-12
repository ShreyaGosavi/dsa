import java.util.Arrays;
import java.util.HashMap;

public class DeleteAndEarn {
    public static int deleteAndEarn(int[] nums) {
        //1. frequency count
        HashMap<Integer, Integer> freq = new HashMap<>(); //value => frequency

        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }

        //2. removing the duplicates and sorting
        int[] arr = new int[freq.size()];
        int idx = 0;
        for (int key : freq.keySet()) {
            arr[idx++] = key;
        }

        Arrays.sort(arr);

        return helper(arr, 0, freq);
    }

    private static int helper(int[] arr, int i, HashMap<Integer, Integer> freq) {
        //if we reach the end
        if(i >= arr.length){
            return 0;
        }

        //skip
        int skip = helper(arr, i+1, freq);

        //take
        int take = arr[i] * freq.get(arr[i]);

        //if next value is arr[i] + 1 => we must skip it
        if(i + 1 < arr.length && arr[i + 1] ==arr[i] + 1){
            take += helper(arr, i+2, freq);
        }
        else{
            take += helper(arr, i+1, freq);
        }

        return Math.max(take, skip);
    }


}
