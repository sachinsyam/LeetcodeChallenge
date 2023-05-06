package Apr;

import java.util.Arrays;

public class Apr24 {
    public static void main(String[] args) {
        int arr [] = new int []{-1,-20,300,40,5};
        int key = 45;
        int closest = Integer.MAX_VALUE;
        int minX=0;
        int minY=1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(i!=j){
                    System.out.println("closest:" + closest);
                    System.out.println("x:" + arr[i] + "\ny:" + arr[j]);
                    if (Math.abs(arr[i] + arr[j]) - key < closest) {
                        minX = i;
                        minY = j;
                        closest = Math.abs(arr[i] + arr[j] - key);
                    }
                }
            }
        }
        System.out.println(arr[minX]+" "+arr[minY]);
        chatGpt();
    }

    static void chatGpt(){
        int arr[] = new int[]{-1,-20,300,40,5};
        int key = 45;

        Arrays.sort(arr); // Sort the array in non-decreasing order

        int left = 0;
        int right = arr.length - 1;
        int minX = 0;
        int minY = arr.length - 1;
        int closest = Math.abs(arr[minX] + arr[minY] - key);

        while (left < right) {
            int sum = arr[left] + arr[right];
            int diff = Math.abs(sum - key);

            if (diff < closest) {
                closest = diff;
                minX = left;
                minY = right;
            }

            if (sum < key) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Closest pair: " + arr[minX] + ", " + arr[minY]);
    }
}
