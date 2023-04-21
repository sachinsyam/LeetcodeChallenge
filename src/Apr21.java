public class Apr21 {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5};
        solution1(arr);
        solution2(arr);
    }
    static void solution1(int[] arr){
        int max = arr[arr.length-1];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += max-arr[i];
        }
        System.out.println(count);
    }
    static void solution2(int [] arr){
        int count = 0;
        int max = arr[arr.length-1];
        for (int i = 0; i < arr.length; i++) {
            while(arr[i] < max){
                arr[i] ++;
                count++;
            }
        }
        System.out.println(count);
    }
}
