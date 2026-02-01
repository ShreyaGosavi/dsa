import java.util.Arrays;

public class Insertion {
    //5 length hai toh 4 baar baar -> which means 0 to 3 inclusive right
    public static void insertion(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j - 1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    //kyuki usse pehle ka toh already sort kara hi tha
                    break;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {5, 3, 8, 1, 4};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
}

/*
1. Space Complexity: O(1)
2. Best Case time complexity -> O(n) (already sorted)
3. worst case time complexity -> O(n^2) (reverse sorted)
4. stable algorithm
 */
