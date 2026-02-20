import java.util.ArrayDeque;
import java.util.Deque;

public class VaildParentheses_20 {
    public boolean isValid(String s) {

        if (s.length() == 1) return false;

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            }
            else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if (ch == ']' && top != '[') return false;
                if (ch == '}' && top != '{') return false;
                if (ch == ')' && top != '(') return false;
            }
        }

        return stack.isEmpty();
    }
}
