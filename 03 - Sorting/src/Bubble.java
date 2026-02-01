import java.util.Arrays;

public class Bubble {
    public static void bubble(int[] arr){
        boolean swapped;

        for(int i = 0; i < arr.length - 1; i++){
            swapped = false;

            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return;
    }

    public static void main(String[] args){
        int[] arr = {5, 3, 8, 1, 4};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}

/*
1. Bubble sort is the simplest sorting amongst all others
2. in place sorting algorithm
3. stable sorting algorithm
4. best case time complexity -> O(n)
5. worst case time complexity -> O(n^2)
6. space complexity -> O(1) -> since in place
7. remember bubble coz after every pass the largest element is secured to the right place.
8. to remember the pseudocode -> swapped, i=0 < arr.length-1;
    j=1 < arr.length - i -> swap and swapped true,
    if not swapped toh break and return.
 */