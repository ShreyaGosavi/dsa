public class SubStringWithinBudget_1208 {
    public static void main(String[] args){

    }

    public static int equalSubstring(String s, String t, int maxCost) {
        int left = 0;
        int currCost = 0;
        int maxLength = 0;

        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);

            currCost += Math.abs(ch - t.charAt(right));

            while(currCost > maxCost){
                currCost -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }

            maxLength = Math.max(right-left+1, maxLength);
        }

        return maxLength;
    }
}
