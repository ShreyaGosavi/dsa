import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class BaseBallGame_682 {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < operations.length; i++){
            if(isNumeric(operations[i])){
                stack.push(Integer.parseInt(operations[i]));
            }
            else if(operations[i].equals("+")){
                int first = stack.pop();
                int second = first + stack.peek();
                stack.push(first);
                stack.push(second);
            }
            else if(operations[i].equals("D")){
                int dup = stack.peek() * 2;
                stack.push(dup);
            }
            else{
                stack.pop();
            }
        }
        int sum = 0;
        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        return sum;
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

    public int calPoints1(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (String op : operations) {
            if (op.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            }
            else if (op.equals("D")) {
                stack.push(stack.peek() * 2);
            }
            else if (op.equals("C")) {
                stack.pop();
            }
            else {
                stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int num : stack) {
            sum += num;
        }

        return sum;
    }


    public static void main(String[] args){
        System.out.println(isNumeric("28"));
    }
}
