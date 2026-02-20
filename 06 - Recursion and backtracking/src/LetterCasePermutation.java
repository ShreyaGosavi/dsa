import java.util.ArrayList;
import java.util.List;
java.lang.String;

public class LetterCasePermutation {
    public static void main(String[] args){

    }

    public static List<String> letterCasePermutation(String s) {
        String one = "";
        return helper(s, one, 0);
    }

    private static List<String> helper(String s, String one, int i) {
        if(i == s.length()){
            List<String> ans = new ArrayList<>();
            ans.add(new String(one));
            return ans;
        }

        List<String> result = new ArrayList<>();
        char ele = s.charAt(i);
        if(!Character.isDigit(ele)){
            //small
            result.addAll(helper(s, one + Character.toLowerCase(ele), i+1));
            //big
            result.addAll(helper(s, one + Character.toUpperCase(ele), i+1));
        }
        else{
            result.addAll(helper(s, one + ele, i+1));
        }

        return result;
    }


}
