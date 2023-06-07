package May;

import java.util.HashMap;
import java.util.Map;

public class June7 {
    public static void main(String[] args) {
        int [] nums = new int[]{0,1,2,2,4,4,1};
        System.out.println(findSol(nums));
    }

    public static int findSol(int [] nums){
        Map<Integer, Integer> map = new HashMap<>();

        boolean notFound = true;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0));
        }

        for (int num : nums) {
            if (num % 2 == 0) {
                notFound = false;
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        if(notFound){
            return -1;
        }
        int res = 0, count = 0;
        for(int x : map.keySet()){
            if(map.get(x) > count){
                count = map.get(x);
                res = x;
            }
            if(map.get(x) == count){
                if(res > x){
                    res = x;
                }
            }
        }

        return res;

    }
}
