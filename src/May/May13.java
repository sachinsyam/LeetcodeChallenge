package May;
/*
1822. Sign of the Product of an Array
Easy
1.8K
182
Companies
There is a function signFunc(x) that returns:

1 if x is positive.
-1 if x is negative.
0 if x is equal to 0.
You are given an integer array nums. Let product be the product of all values in the array nums.

Return signFunc(product).


 */
public class May13 {
    public static void main(String[] args) {
        System.out.println(arraySign(new int[]{41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41}));
    }
    public static int arraySign(int[] nums) {
        int res=1;
        for(int n: nums){
            if(n==0){
                res =0;
                break;
            }
            res = res * n;
            if(res>1)
                res = 1;
            else res = -1;
        }
        return res;

    }


}
