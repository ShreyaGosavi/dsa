import static java.util.Collections.reverse;

public class RotateNPlaces {

    public static int[] reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public static int[] reverse1(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public static int[] rotate(int[] arr, int n){
        arr = reverse(arr);

        arr = reverse1(arr, 0, arr.length - 1 - n);
        reverse1(arr, arr.length - n, arr.length - 1);

        return arr;
    }
}
