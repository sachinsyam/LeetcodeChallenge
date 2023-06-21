package May;

import java.util.*;

import static May.June9.Solution.canBeIncreasing;

public class June9 {
    public static void main(String[] args) {
        int nums [] = new int[]{1,1,1};


        System.out.println("res "+ canBeIncreasing(nums));

    }
    class Solution {
        public static boolean canBeIncreasing(int[] nums) {
            int count = 0;

            for (int i = 1; i < nums.length; i++)
                if (nums[i] <= nums[i - 1]) {
                    count++;
                    if (count > 1)
                        return false;
                    if (i > 1 && nums[i] <= nums[i - 2])
                        nums[i] = nums[i - 1];
                }

            return true;
        }
    }

}
