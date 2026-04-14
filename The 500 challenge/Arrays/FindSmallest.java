public class FindSmallest {
    public static int minimum(int[] arr){
        int n = arr.length;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
