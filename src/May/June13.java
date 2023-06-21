package May;

public class June13 {
    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";

        int[] chars = new int[25];

        for (int i = 0; i < s.length(); i++) {
            int x = s.charAt(i) - 97;
            chars[x]++;
        }
        for (int i = 0; i < t.length(); i++) {
            int x = t.charAt(i) - 97;
            chars[x]++;
        }

        boolean result = true;
        for (int i = 0; i < s.length(); i++) {
            int x = s.charAt(i) - 97;
            if (chars[x] != 2) {
                result = false;
                break;
            }
        }
    }
}
