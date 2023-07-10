package July;

import java.util.Arrays;
//2733. Neither Minimum nor Maximum
public class July10 {
    public static void main(String[] args) {
        int nums [] = new int[]{3,1,2,4};

        Arrays.sort(nums);

        int min = nums[0];
        int max = nums[nums.length-1];

        int res = -1;
        for(int i = 0; i< nums.length; i++){
            if(i != 0 && i != nums.length-1){
                if(nums[i] != min && nums[i]!=max){
                    res = nums[i];
                    break;
                }
            }
        }

        System.out.println(res);
    }
}
