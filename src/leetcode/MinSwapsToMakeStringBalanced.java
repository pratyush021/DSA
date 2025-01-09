package leetcode;

import java.util.Stack;

public class MinSwapsToMakeStringBalanced {
    public int minSwaps(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '[') {
                stack.push(c);
            } else if(c == ']') {
                if(!stack.isEmpty()) {
                    if(stack.peek() == '[') stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        return stack.size()/2;
    }
    

    public static void main(String[] args) {
        
        MinSwapsToMakeStringBalanced solution = new MinSwapsToMakeStringBalanced();

        // Test case 1: Already balanced string
        String s1 = "[][]";
        System.out.println("Test case 1: " + s1 + " - Expected: 0, Actual: " + solution.minSwaps(s1));

        // Test case 2: Unbalanced string requiring 1 swap
        String s2 = "][][";
        System.out.println("Test case 2: " + s2 + " - Expected: 1, Actual: " + solution.minSwaps(s2));

        // Test case 3: Unbalanced string requiring 2 swaps
        String s3 = "]]][[[][";
        System.out.println("Test case 3: " + s3 + " - Expected: 2, Actual: " + solution.minSwaps(s3));

        // Test case 4: Already balanced longer string
        String s4 = "[[[]]][[[]]]";
        System.out.println("Test case 4: " + s4 + " - Expected: 0, Actual: " + solution.minSwaps(s4));

        // Test case 5: Empty string
        String s5 = "";
        System.out.println("Test case 5: " + s5 + " - Expected: 0, Actual: " + solution.minSwaps(s5));

        // Test case 6: Single character (invalid input)
        String s6 = "[";
        System.out.println("Test case 6: " + s6 + " - Expected: -1, Actual: " + solution.minSwaps(s6));

    }
}
