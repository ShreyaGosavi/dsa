import java.util.Arrays;

public class Cyclic {
    public static void cyclic(int[] arr){
        int i = 0;

        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(i != correctIndex){ //arr[i] != arr[correctIndex]
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else{
                i++;
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {5, 3, 2, 1, 4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
}
/*
1. used when it is guranteed that elements in the array are from range 1 to n -> we can use cyclic sort
2. basic concept -> ek element ka correct place is (element - 1)th index
3. in-place sorting technique
4. time complexity -> O(n)
5. not stable
 */