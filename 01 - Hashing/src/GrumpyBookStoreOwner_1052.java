public class GrumpyBookStoreOwner_1052 {
    public static void main(String[] args){

    }

    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int baseline = 0;

        // Step 1: baseline satisfaction
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                baseline += customers[i];
            }
        }

        // Step 2: fixed window to maximize recovered customers
        int extraSatisfied = 0;
        int maxExtra = 0;
        int left = 0;

        for (int right = 0; right < customers.length; right++) {

            if (grumpy[right] == 1) {
                extraSatisfied += customers[right];
            }

            if (right - left + 1 == minutes) {
                maxExtra = Math.max(maxExtra, extraSatisfied);

                if (grumpy[left] == 1) {
                    extraSatisfied -= customers[left];
                }
                left++;
            }
        }

        return baseline + maxExtra;
    }
}
