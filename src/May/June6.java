package May;

import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Set;

public class June6 {
    public static void main(String[] args) {
        int arr [] = new  int[]{-2,0,10,-19,4,6,-8};

        boolean found = false;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if(i!=j){
                    if (arr[i] != 0 && arr[i] == 2 * arr[j]) {
                        System.out.println("i=" + arr[i] + " " + " 2xj=" + arr[j] * 2);
                        found = true;
                        break;
                    }
                    if ((arr[i] == 0 && arr[j] == 0)) {
                        System.out.println("i=" + i + " " + " j=" + j);
                        found = true;
                        break;
                    }
                }
            }
        }
        System.out.println(found);
    }

    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(2 * num) || (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }
            set.add(num);
        }

        return false;
    }


}
