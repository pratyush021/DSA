package codeforces;

import java.util.Scanner;

public class ABFlipping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        ABFlipping abFlipping = new ABFlipping();
        while (t-- > 0) {
            // Read n and s for each test case
            int n = sc.nextInt();
            String s = sc.next(); // or sc.nextLine() if string might contain spaces

            // Call your function for each test case
            String result = abFlipping.solve(n, s);
            System.out.println(result);
        }

        sc.close();
    }

    private String solve(int n, String s) {
        int operations = 0;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == 'A' && s.charAt(i + 1) == 'B') {
                operations++;
            }
        }
        return String.valueOf(operations);
    }
}
