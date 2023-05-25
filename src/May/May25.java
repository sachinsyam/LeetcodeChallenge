package May;
/*
leetcode 2520
 */
public class May25 {
    public static void main(String[] args) {
        System.out.println(countDigits(121));
        System.out.println(countDigitsUsingMath(121));

    }

    public static int countDigits(int num) {
        String str = Integer.toString(num);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            int x = Integer.parseInt(Character.toString(str.charAt(i)));
            if (num % x == 0) {
                count++;
            }
        }
        return count;
    }

    static int countDigitsUsingMath(int number) {
        int originalNumber = number;
        int count = 0;

        while (number > 0) {
            int lastDigit = number % 10;

            if (originalNumber % lastDigit == 0) {
                count++;
            }

            number /= 10;
        }

        return count;
    }
}