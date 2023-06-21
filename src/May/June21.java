package May;

public class June21 {
    public static void main(String[] args) {
        int n = 8;
        int step = 0;
        while(n>0){
            if(n%2 == 0){
                n = n/2;
            }else{
                n--;
            }
            step++;
        }
        System.out.println(step);
    }
}
