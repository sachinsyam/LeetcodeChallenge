//Write a function that takes two arrays of integers and returns a new array that contains only the elements that appear in both arrays.

public class Apr20 {
    public static void main(String[] args) {
        int arr1 [] = new int[]{1,1,1,1,2,3,4,5};
        int arr2 [] = new int[]{1,2,6,7,3,3};
        int arr3 [] = new int[arr1.length];
        int k=0;

        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]){
                    boolean flag = false;
                    for (int l = 0; l < arr3.length; l++) {
                        if(arr1[i] == arr3[l]){
                            flag = true;
                            break;
                        }
                    }
                    if(!flag) {
                        arr3[k] = arr1[i];
                        k++;
                    }
                }
            }
        }

        for (int i = 0; i < k; i++)
            System.out.println(arr3[i]+" ");

    }
}
