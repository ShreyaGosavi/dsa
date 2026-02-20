public class SortColours {
    public static void main(String[] args){

    }

    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid < high){
            if(nums[mid] == 0){
                //swap
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                //update
                low++;
                mid++;
            }

            else if(nums[mid] == 1){
                mid++;
            }

            else{
                //swap
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                //update
                high --;
            }
        }
        return;
    }

}
