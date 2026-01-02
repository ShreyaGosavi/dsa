import java.util.HashMap;

public class FirstUniqChar_0387 {
    public static void main(String[] args){

    }
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for(char ch : s.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        for(int i = 0; i < s.length(); i++){
            if(freqMap.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
