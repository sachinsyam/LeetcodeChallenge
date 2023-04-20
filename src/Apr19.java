//Write a program to print all unique elements in an array.
public class Apr19 {
    public static void main(String[] args) {
        int arr [] = new int[]{1,1,1,1,2,3,4,4,5};
        int uniqueArray [] = new int[arr.length];
        int k=0;

        for (int i = 0; i < arr.length ; i++) {
            boolean flag = false;
            for (int j = 0; j <= k; j++) {
                if(arr[i] == uniqueArray[j]){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                uniqueArray[k] = arr[i];
                k++;
            }
        }
        for (int i = 0; i <k ; i++) {
            System.out.print(uniqueArray[i]+" ");
        }
    }
}
