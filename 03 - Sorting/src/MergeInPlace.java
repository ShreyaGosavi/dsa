import java.util.Arrays;

public class MergeInPlace {

    public static void mergeSort(int[] arr){
        mergeSortInPlace(arr, 0, arr.length);
    }

    private static void mergeSortInPlace(int[] arr, int s, int e) {
        if (e - s <= 1) {
            return;
        }

        int mid = (s + e) / 2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] <= arr[j]) {
                mix[k++] = arr[i++];
            } else {
                mix[k++] = arr[j++];
            }
        }

        while (i < m) {
            mix[k++] = arr[i++];
        }

        while (j < e) {
            mix[k++] = arr[j++];
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
/*
T(n)=O(nlogn)
Auxiliary space: O(n) //due to temporary merge array
Stack space: O(log n)
 */
