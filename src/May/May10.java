package May;

import java.util.Arrays;
/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.



Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].

 */
public class May10 {
    public static void main(String[] args) {
        Arrays.stream(sum(new int[]{1, 2, 9})).forEach(a -> System.out.print(a));
        System.out.println();
        Arrays.stream(sum(new int[]{9, 9, 9})).forEach(a -> System.out.print(a));
        System.out.println();
        Arrays.stream(plusOneSolutionFromLeetCode(new int[]{9, 9, 1})).forEach(a -> System.out.print(a));
    }
    public static int[] sum(int[] digits){
        int count9 =0;
        int countAll =0;
        for (int i = 0; i < digits.length ; i++) {
            if(digits[i] == 9){
                count9++;
            }
            countAll++;
        }
        if(count9 == countAll){
            int res[] = new int[count9+1];
            int k=0;
            for (int i = 1; i < res.length ; i++) {
                res[i] = digits[k];
                k++;
            }
            return doTheOperation(res);
        }
        return doTheOperation(digits);
    }
    public static int[] doTheOperation(int [] digits){
        for (int i = digits.length-1; i >=0;) {
            if(digits[i] % 10 == 9){
                digits[i] = 0;
                i--;
            }else{
                digits[i]++;
                break;
            }
        }
        return digits;
    }


    public static int[] plusOneSolutionFromLeetCode(int[] digits) {

        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int [n+1];
        newNumber[0] = 1;

        return newNumber;
    }

}
