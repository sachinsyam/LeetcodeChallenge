package Apr;

public class Apr29 {
    //https://leetcode.com/problems/minimum-average-difference/
  /*  You are given a 0-indexed integer array nums of length n.

    The average difference of the index i is the absolute difference between the average of the first i + 1 elements of nums and the average of the last n - i - 1 elements. Both averages should be rounded down to the nearest integer.

    Return the index with the minimum average difference. If there are multiple such indices, return the smallest one.

            Note:

    The absolute difference of two numbers is the absolute value of their difference.
    The average of n elements is the sum of the n elements divided (integer division) by n.
    The average of 0 elements is considered to be 0.*/
    public static void main(String[] args) {
        int arr [] = new int[]{2,5,3,9,5,3};
        int min [] = new int[arr.length];
        int minLength =0;
        for (int i = 0; i < arr.length ; i++) {
            int leftSum =0, rightSum =0, leftCount=0, rightCount=0;
            for (int j = 0; j <=i ; j++) {
                leftSum+=arr[j];
                leftCount++;
            }
            for (int j = i+1; j < arr.length ; j++) {
                rightSum+=arr[j];
                rightCount++;
            }
            //sometimes count will become 0, and it will throw, can't divide by 0 error, hanfle that
            if(leftCount<1)
                leftCount=1;
            if(rightCount<1)
                rightCount=1;

            leftSum = leftSum / leftCount;
            rightSum = rightSum / rightCount;
            min[i] = Math.abs(leftSum - rightSum);
            minLength++;
        }
        int res = min[0];
        int minIndex = 0;
        for (int i = 0; i < minLength ; i++) {
            if(min[i]<res) {
                res = min[i];
                minIndex = i;
            }
        }

        System.out.println("Min Index:"+minIndex);
    }
}
