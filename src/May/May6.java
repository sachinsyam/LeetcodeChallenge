package May;

import java.util.ArrayList;
import java.util.List;
/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.



Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]
 */

public class May6 {
    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
        System.out.println(o1SpaceComplexity(new int[]{4,3,2,7,8,2,3,1}));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int length = nums.length;
        int arr[] = new int[length];
        for (int i = 0; i <length ; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i <length ; i++) {
            arr[nums[i]-1] = nums[i];
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <length ; i++) {
            if(arr[i] == 0)
                result.add(i+1);
        }
        return result;
    }

    public static List<Integer> o1SpaceComplexity(int[] nums) {
        List<Integer> result = new ArrayList<>();

        // Negate the value at the index corresponding to each number in the array
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        // Any positive value at an index indicates a missing number
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }


}
