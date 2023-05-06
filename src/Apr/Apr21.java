package Apr;

import java.util.Arrays;

public class Apr21 {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5};
//        solution1(arr);
//        solution2(arr);
//        int steps = minStepsToMakeAllEqual(arr);
//        System.out.println(steps);
        System.out.println(minStepsLambda(arr, arr[arr.length/2]));

    }
    static void solution1(int[] arr){
        int max = arr[arr.length-1];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += max-arr[i];
        }
        System.out.println(count);
    }
    static void solution2(int [] arr){
        int count = 0;
        int max = arr[arr.length-1];
        for (int i = 0; i < arr.length; i++) {
            while(arr[i] < max){
                arr[i] ++;
                count++;
            }
        }
        System.out.println(count);
    }
    //finds minimum steps to make all elements equal by making all elements to mid element.
    public static int minStepsToMakeAllEqual(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int median = n % 2 == 0 ? (nums[n/2-1] + nums[n/2]) / 2 : nums[n/2];
        int steps = 0;
        for (int num : nums) {
            steps += Math.abs(num - median);
        }
        return steps;
    }

    public static int minStepsLambda(int [] nums, int mid){
        return Arrays.stream(nums).map(n -> Math.abs(n - mid)).sum();
    }

}
