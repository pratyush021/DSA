package leetcode;

import java.util.Arrays;
import java.util.Collections;

public class ChalkReplacer {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for (int ele : chalk) {
            sum += (long) ele;
        }
        k = (int) (((long) k) % sum);
        int i = 0;
        while (i < chalk.length) {
            if (chalk[i] > k) return i;
            k -= (long) chalk[i];
            i++;
        }
        return 0;
    }

    public static void main(String[] args) {
        ChalkReplacer replacer = new ChalkReplacer();
        int[] arr = {5, 1, 5};
        int k = 22;
        int n = replacer.chalkReplacer(arr, k);
        System.out.println(n);

    }
}
