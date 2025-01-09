package neetcode150.slidingwindow;

import java.util.Arrays;

public class CharacterReplacement {
    public static int characterReplacement(String s, int k) {
        int[] map = new int[26];
        int start = 0, maxCount = 0, maxLength = 0;
        for (int end = 0; end < s.length(); end++) {
            maxCount = Math.max(maxCount, ++map[s.charAt(end) - 'A']);
            while (end - start + 1 - maxCount > k) {
                map[s.charAt(start) - 'A']++;
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);

        }
        return maxLength;
    }

    public static boolean checkInclusion(String s1, String s2) {
        int i = 0, j = 0;
        int k = s1.length();
        while (i < s2.length() && j < s2.length()) {
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (check(s2.substring(i, j), s1) == true) {
                    return true;
                } else {
                    i++;
                    j++;
                }
            }
        }
        return false;
    }

    private static boolean check(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int idx = 0;
        while (idx < arr1.length) {
            if (arr1[idx] != arr2[idx])
                return false;
            idx++;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 2;
        // System.out.println(characterReplacement(s, k));
        System.out.println(checkInclusion("ab", "eidcooo"));
    }
}
