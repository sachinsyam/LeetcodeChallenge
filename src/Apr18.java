//find missing number
public class Apr18 {
    public static void main(String[] args) {
        int [] arr = new int[]{5,6,3,1,2};
        int n = arr.length;
        int [] testArr = new int[n+2];

        for (int i = 0; i <n ; i++)
            testArr[arr[i]] = 1;

        int missingNum=-1;
        for (int i = 1; i <n+2 ; i++) {
            if (testArr[i] != 1){
                missingNum = i;
                break;
            }
        }
        System.out.println(missingNum);
    }
}
