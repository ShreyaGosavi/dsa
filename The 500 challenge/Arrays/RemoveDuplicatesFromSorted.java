public class RemoveDuplicatesFromSorted {
    public static int[] removeDuplicates(int[] arr){
        int nextValid = 1;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i - 1]){
                arr[nextValid++] = arr[i];
            }
        }

        return arr;
    }
}
