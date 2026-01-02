/*
Problem no: 771 - easy
time complexity: o(stones + jewels) worst case
space complexity: o(stones.length) worst case
 */

import java.util.HashMap;

public class JewelsStones {
    public static void main(String[] args){
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;

        for(int i = 0; i < stones.length(); i++){
            map.put(stones.charAt(i), map.getOrDefault(stones.charAt(i), 0) + 1);
        }

        for(int i = 0; i < jewels.length(); i++){
            if(map.containsKey(jewels.charAt(i))){
                count += map.get(jewels.charAt(i));
            }
        }
        return count;
    }
}
