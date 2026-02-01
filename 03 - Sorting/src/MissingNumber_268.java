public class MissingNumber_268 {
    public int missingNumber(int[] nums) {
        int i = 0;
        int n = nums.length;

        while (i < n) {
            int correct = nums[i];
            if (correct < n && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < n; index++) {
            if (nums[index] != index) {
                return index;
            }
        }

        return n;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
