public class SecondLargest {
    public static int secondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                sl = largest;
                largest = arr[i];
            }

            if(arr[i] < largest && arr[i] > sl){
                sl = arr[i];
            }
        }
        return sl;
    }
}
