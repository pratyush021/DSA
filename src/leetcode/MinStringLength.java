package leetcode;

public class MinStringLength {
    public int minLength(String s) {

        while (s.contains("AB") || s.contains("CD")) {
            s = s.replace("AB", "").replace("CD", "");
        }
        return s.length();
    }

    public static void main(String[] args) {
        String str = "ABFCACDB";
        MinStringLength obj = new MinStringLength();
        System.out.println(obj.minLength(str));
    }
}
