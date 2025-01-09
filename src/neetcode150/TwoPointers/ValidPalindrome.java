package neetcode150.TwoPointers;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder sol = new StringBuilder();
        for(char ch: s.toCharArray()) {
            if(Character.isAlphabetic(ch) || Character.isDigit(ch)) {
                sol.append(Character.toLowerCase(ch));
            }
        }
        String str = sol.toString();

        String temp = sol.reverse().toString();
        if(temp.equals(str)) return true;
        return false;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        ValidPalindrome obj = new ValidPalindrome();
        System.out.println(obj.isPalindrome(s));
    }
}
