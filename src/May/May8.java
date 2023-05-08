package May;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class May8 {
    public static void main(String[] args) {
        List<List<Integer>> ans = solution(new int[]{1,2,3,3}, new int[]{1,1,2,2});
        for(List<Integer> s : ans){
            s.stream().forEach(a -> System.out.println(a));
        }

    }
    public static List<List<Integer>> solution(int[] nums1, int [] nums2){
        boolean flag = false;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> res1 = new ArrayList<>();
        List<Integer> res2 = new ArrayList<>();

        for (int i = 0; i < nums1.length ; i++) {
            for (int j = 0; j < nums2.length ; j++) {
                if(nums1[i] == nums2[j]){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                if(!res1.contains(nums1[i]))
                res1.add(nums1[i]);
            }

            flag = false;

        }
        result.add(res1);


        flag = false;

        for (int i = 0; i < nums2.length ; i++) {
            for (int j = 0; j < nums1.length ; j++) {
                if(nums2[i] == nums1[j]){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                if(!res2.contains(nums2[i]))
                res2.add(nums2[i]);
            }

            flag = false;

        }
        result.add(res2);

        return result;
    }
}
