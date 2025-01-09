package leetcode;

import java.util.HashSet;

public class FindLongestCommonPrefix {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<String> set = new HashSet<>();
        int size = Integer.MIN_VALUE;
        for(int i: arr1) {
            String c = Integer.toString(i);
            for(int j = 0; j < c.length(); j++) {
                set.add(c.substring(0, j + 1));
            }
        }
        for(int i: arr2) {
            String c = Integer.toString(i);
            for(int j = 0; j < c.length(); j++) {
                String str = c.substring(0, j + 1);
                if(set.contains(str)) {
                    size = Math.max(size,str.length());
                }
            }
        }
        return size;
    }

    private String findAllPrefixes(int a) {
        return "";
    }
    private String findLCP(int a, int b) {
        String s1 = Integer.toString(a);
        String s2 = Integer.toString(b);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s1.length(); i++) {
            if(i < s2.length()) {
                if(s1.toCharArray()[i] == s2.toCharArray()[i]) sb.append(s1.toCharArray()[i]);
                else return sb.toString();
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        FindLongestCommonPrefix obj = new FindLongestCommonPrefix();
        int[] arr1 = {1, 10, 100};
        int[] arr2 = {1000};
        int ans = obj.longestCommonPrefix(arr1, arr2);
        System.out.println(ans);
    }
}
