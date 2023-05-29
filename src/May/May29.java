package May;

public class May29 {
    /*
    https://leetcode.com/problems/form-smallest-number-from-two-digit-arrays/solutions/3573876/brute-force-solution-by-convrting-integer-to-string-and-back-to-integer/
     */
    public static void main(String[] args) {
        int [] num1 = new int[]{6,4,3,7,2,1,8,5};
        int [] num2 = new int[]{6,8,5,3,1,7,4,2};

        System.out.println(calc(num1,num2));


    }

    static int calc(int[] nums1, int[] nums2){

        boolean flag = false;

        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < nums1.length ; i++) {
            for (int j = 0; j < nums2.length ; j++) {
                if(nums1[i] == nums2[j]){
                    if(nums1[i]<smallest) {
                        smallest = nums1[i];
                        flag = true;
                    }
                }
            }
        }

        if(flag){
            return smallest;
        }

        int smallest1 = nums1[0];
        int smallest2 = nums2[0];

        for (int i = 0; i < nums1.length ; i++) {
            if(nums1[i] < smallest1){
                smallest1 = nums1[i];
            }
        }

        for (int i = 0; i < nums2.length ; i++) {
            if(nums2[i] < smallest2){
                smallest2 = nums2[i];
            }
        }


        String str1 = Integer.toString(smallest1);
        String str2 = Integer.toString(smallest2);

        if(smallest1 < smallest2){
            return Integer.parseInt(str1.concat(str2));
        }else{
            return Integer.parseInt(str2.concat(str1));
        }

    }
}
