public class May2 {
    //input 123
    //output 123123
    public static void main(String[] args) {
        int arr [] = new int[]{1,2,3};
        int ans[] = new int[arr.length*2];
        for (int i = 0; i < arr.length ; i++) {
            ans[i] = arr[i];
            ans[arr.length+i] = arr[i];
        }
        for(int num: ans)
        System.out.print(num);
    }
}
