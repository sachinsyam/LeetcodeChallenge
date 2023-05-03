public class May3 {
    /*Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.
    Example 1:

    Input: nums = [3,2,1]
    Output: 1
    Explanation:
    The first distinct maximum is 3.
    The second distinct maximum is 2.
    The third distinct maximum is 1.
    Example 2:

    Input: nums = [1,2]
    Output: 2
    Explanation:
    The first distinct maximum is 2.
    The second distinct maximum is 1.
    The third distinct maximum does not exist, so the maximum (2) is returned instead.
    Example 3:

    Input: nums = [2,2,3,1]
    Output: 1
    Explanation:
    The first distinct maximum is 3.
    The second distinct maximum is 2 (both 2's are counted together since they have the same value).
    The third distinct maximum is 1.*/
    public static void main(String[] args) {
        int nums [] = new int[]{1,1,3};
        System.out.println(findThirdMax(nums));
    }
    static int findThirdMax(int [] nums){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for(int i=0; i < nums.length; i++){
            if(nums[i] > first){
                third = nums[i];
                second = third;
                first = second;
            }
            else if(nums[i] > second){
                second = nums[i];
                third = second;
            }
            else{
                third = nums[i];
            }
        }
        if(third != 0)
            return third;
        else if(second != 0)
            return second;
        else
            return third;
    }
}
