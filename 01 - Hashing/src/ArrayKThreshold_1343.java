public class ArrayKThreshold_1343 {
    public static void main(String[] args){
        int[] arr = {2,2,2,2,5,5,5,8};
        int k = 3;
        int threshold = 4;
        System.out.println(numOfSubarrays(arr, k, threshold));

    }

    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int left = 0;
        int count = 0;
        int currSubSum = 0;

        for(int right = 0; right < arr.length; right++){
            currSubSum += arr[right];

            if(right-left+1 == k){
                if(currSubSum/k >= threshold){
                    count++;
                }
                currSubSum -= arr[left];
                left++;
            }
        }
        return count;
    }
}
