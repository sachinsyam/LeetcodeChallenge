package May;

public class May30 {
    /*
    You are given a 0-indexed integer array nums and an integer k. Your task is to perform the following operation exactly k times in order to maximize your score:

Select an element m from nums.
Remove the selected element m from the array.
Add a new element with a value of m + 1 to the array.
Increase your score by m.
Return the maximum score you can achieve after performing the operation exactly k times.



Example 1:

Input: nums = [1,2,3,4,5], k = 3
Output: 18
Explanation: We need to choose exactly 3 elements from nums to maximize the sum.
For the first iteration, we choose 5. Then sum is 5 and nums = [1,2,3,4,6]
For the second iteration, we choose 6. Then sum is 5 + 6 and nums = [1,2,3,4,7]
For the third iteration, we choose 7. Then sum is 5 + 6 + 7 = 18 and nums = [1,2,3,4,8]
So, we will return 18.
It can be proven, that 18 is the maximum answer that we can achieve.
     */
    public static void main(String[] args) {
        int [] nums = new int[]{5,3,6};
        int k = 9;
        int counter = 0;

        /*
        5 3 6
        5 3 7
        5 3 8
        5 3 9
        5 3 10
        5 3 11
        5 3 12
        5 3 13
        5 3 14

        ans:90
         */


        int sum = 0;

         while(counter<k) {
            counter++;

            int max = nums[0];
            int index = 0;
            for (int j = 0; j <nums.length ; j++) {
                if(nums[j] >= max){
                    max = nums[j];
                    index = j;
                }
            }
            sum += max;
            nums[index]++;

        }
        System.out.println(sum);
    }


}
