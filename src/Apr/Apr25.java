package Apr;

import java.sql.Array;
import java.util.Arrays;
/*You are given an array of integers stones where stones[i] is the weight of the ith stone.

        We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together.
        Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:

        If x == y, both stones are destroyed, and
        If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
        At the end of the game, there is at most one stone left.

        Return the weight of the last remaining stone. If there are no stones left, return 0.


        Example:

        Input: stones = [2,7,4,1,8,1]
        Output: 1
        Explanation:
        We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
        we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
        we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
        we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of the last stone.*/
public class Apr25 {
    public static void main(String[] args) {
//        int res = stones(new int[]{2,7,4,1,8,1},6);
        int res = stones(new int[]{31,26,33,21,40},5);
        System.out.println(res);
    }

    static int stones(int[] arr, int length){
        if(length ==1) {
            return arr[0];
        }
        else if (length ==2) {
            if(arr[0] == arr[1])
                return 0;
        }

            //creating a new array after deleting elements from the previous step
            int [] newArr = new int[length];
            for (int i = 0; i < length; i++) {
                newArr[i] = arr[i];
            }
            Arrays.sort(newArr);
            int max = newArr[length-1];
            int secondMax = newArr[length-2];
            int newStone = max - secondMax;
            if(newStone == 0){
                //if newStone == 0 it means, both max and second max should be deleted.
                return stones(newArr, length-2);
            }
            else{
                newArr[length-2] = newStone;
                return stones(newArr, length-1);

            }

    }
}
