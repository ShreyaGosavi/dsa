import java.util.Arrays;

public class Selection {
    public static void selection(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            int lastIndex = arr.length - 1 - i;
            int maxIndex = getMaxIndex(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
    }

    public static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int j = start; j <= end; j++){
            if(arr[j] > arr[max]){
                max = j;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int one, int two){
        int temp = arr[one];
       arr[one] = arr[two];
        arr[two] = temp;
        return;
    }

    public static void main(String[] args){
        int[] arr = {5, 3, 8, 1, 4};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}

/*
1. in place sorting algorithm -> space complexity -> O(1)
2. best and worst case time complexity -> O(n^2)
3. non stable sorting algorithm
 */
