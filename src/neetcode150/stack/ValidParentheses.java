package neetcode150.stack;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> characters = new Stack<>();
        for(char ch: s.toCharArray()) {
            switch(ch) {
                case '(':
                case '[':
                case '{':
                    characters.push(ch);
                    break;
                case ')':
                    if(characters.isEmpty() || characters.peek() != '(') return false;
                    else characters.pop();
                    break;
                case '}':
                    if(characters.isEmpty() || characters.peek() != '{') return false;
                    else characters.pop();
                    break;
                case ']':
                    if(characters.isEmpty() || characters.peek() != '[') return false;
                    else characters.pop();
                    break;

            }
        }
        return characters.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "([])";
        System.out.println(isValid(s1)); // Expected output: true

        // Test case 2: Invalid parentheses
        String s2 = "([)]";
        System.out.println(isValid(s2)); // Expected output: false

        // Test case 3: Empty string
        String s3 = "";
        System.out.println(isValid(s3)); // Expected output: true

        // Test case 4: Single type of parentheses
        String s4 = "((()))";
        System.out.println(isValid(s4)); // Expected output: true

        // Test case 5: Mixed types of parentheses
        String s5 = "{[()]}";
        System.out.println(isValid(s5)); // Expected output: true

        // Test case 6: Unmatched opening parentheses
        String s6 = "(((";
        System.out.println(isValid(s6)); // Expected output: false

        // Test case 7: Unmatched closing parentheses
        String s7 = ")))";
        System.out.println(isValid(s7)); // Expected output: false
    }
}
