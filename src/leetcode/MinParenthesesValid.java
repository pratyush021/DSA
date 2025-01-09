package leetcode;

import java.util.Stack;

public class MinParenthesesValid {

    public int minAddToMakeValid(String s) {
        // The implementation will be added here

        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(c);
            } else if(c == ')'){
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }
            }
        }
        return stack.size();
    }

    public static void main(String[] args) {
        MinParenthesesValid solution = new MinParenthesesValid();
        
        // Test case 1: Already valid
        String s1 = "()";
        System.out.println("Test case 1: " + s1 + " -> " + solution.minAddToMakeValid(s1));
        
        // Test case 2: Missing closing parenthesis
        String s2 = "((";
        System.out.println("Test case 2: " + s2 + " -> " + solution.minAddToMakeValid(s2));
        
        // Test case 3: Missing opening parenthesis
        String s3 = "))";
        System.out.println("Test case 3: " + s3 + " -> " + solution.minAddToMakeValid(s3));
        
        // Test case 4: Mixed case
        String s4 = "())((";
        System.out.println("Test case 4: " + s4 + " -> " + solution.minAddToMakeValid(s4));
        
        // Test case 5: Empty string
        String s5 = "";
        System.out.println("Test case 5: " + s5 + " -> " + solution.minAddToMakeValid(s5));
        
        // Test case 6: Alternating parentheses
        String s6 = "()()()";
        System.out.println("Test case 6: " + s6 + " -> " + solution.minAddToMakeValid(s6));
        
        // Test case 7: Nested parentheses
        String s7 = "(()())";
        System.out.println("Test case 7: " + s7 + " -> " + solution.minAddToMakeValid(s7));
        
        // Test case 8: Complex mixed case
        String s8 = "()))((";
        System.out.println("Test case 8: " + s8 + " -> " + solution.minAddToMakeValid(s8));
    }
}
