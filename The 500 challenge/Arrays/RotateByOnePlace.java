public class RotateByOnePlace {
    public static int[] rotate(int[] arr){
        int next = -1;
        for(int i = 0; i < arr.length; i++){
            int temp = arr[i];
            arr[i] = next;
            next = temp;
        }
        arr[0] = next;
        return arr;
    }
}
