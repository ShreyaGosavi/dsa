/*
Problem no: 202 - easy
time complexity: o(log n) worst case
space complexity: o(log n) worst case
The number of digits calculation takes \(O(\log n)\) time in the inner loop [1].
Because the sum of squares of digits rapidly reduces any number below 243,
the outer loop runs a constant number of times, making the overall complexity \(O(\log n)\) [1]. 
 */

import java.util.HashSet;

public class HappyNumber_202 {
    public static void main(String[] args){
        System.out.println(isHappy(2));
    }

    public static boolean isHappy(int n) {
        //A number is a single digit if it equals itself when divided by 10.
        if(n == 1){
            return true;
        }

        HashSet<Integer> set = new HashSet<>();
        set.add(n);
        while(n != 1){
            int curr = n;
            int newDigit = 0;
            while (curr > 0) {
                newDigit = newDigit + ((curr % 10) * (curr % 10));// Prints digits in reverse order (2, 1, 9)
                curr = curr / 10;
            }

            if(set.contains(newDigit)){
                if(newDigit != 1){
                    return false;
                }
            }
            else{
                set.add(newDigit);
            }

            n = newDigit;
        }
        return true;
    }
}
