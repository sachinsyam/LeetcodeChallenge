package May;

public class May1 {
    //find the missing number in a series given the actual length
    public static void main(String[] args) {
        int arr[] = new int[]{0,1,3};
        int n = 4;
        int arrSum = 0;
        int actualSum = 0;
        for (int i = 0; i <n-1 ; i++) {
            actualSum += i;
            arrSum += arr[i];
        }
        actualSum += n-1;
        System.out.println(actualSum-arrSum);
    }
}
