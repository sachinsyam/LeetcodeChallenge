package May;

import java.util.HashMap;
import java.util.Map;

public class May9 {
    /*
    Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.

Return the largest lucky integer in the array. If there is no lucky integer return -1.



Example 1:

Input: arr = [2,2,3,4]
Output: 2
Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
Example 2:

Input: arr = [1,2,2,3,3,3]
Output: 3
Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
Example 3:

Input: arr = [2,2,2,3,3]
Output: -1
Explanation: There are no lucky numbers in the array.
     */
    public static void main(String[] args) {
        System.out.println(findLuckiestUsingMap(new int[]{1, 2, 2, 3, 3, 3}));
        System.out.println(findLuckiestUsingMap(new int[]{2,2,2,3,3}));
        System.out.println(findLuckiestUsingLoops(new int[]{1, 2, 2, 3, 3, 3}));
        System.out.println(findLuckiestUsingLoops(new int[]{2,2,2,3,3}));
    }
    static int findLuckiestUsingMap(int [] arr){
        Map<Integer,Integer> map = new HashMap<>();
        boolean luckyFlag = false;

        for (int i = 0; i < arr.length ; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        int max = Integer.MIN_VALUE;
        for(int key : map.keySet()){
            if(key == map.get(key)){
                luckyFlag = true;
                if (key > max) {
                    max = key;
                }
            }
        }
        if(luckyFlag){
            return max;
        }else{
            return -1;
        }
    }

    static int findLuckiestUsingLoops(int [] arr){
        int max = Integer.MIN_VALUE;
        boolean luckyFlag = false;
        for (int i = 0; i <arr.length ; i++) {
           int count = 0;
            for (int j = 0; j <arr.length ; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
           if(count == arr[i]) {
                if (count > max) {
                    max = count;
                }
               luckyFlag = true;
            }
        }
        if(luckyFlag){
            return max;
        }else{
            return -1;
        }
    }
}
