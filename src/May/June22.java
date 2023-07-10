package May;

public class June22 {
    public static void main(String[] args) {
        int n = 11;

        int res[] = new int[2];
        res[0] = n-1;
        res[1] = 1;
    }

    class Solution {
        public int[] getNoZeroIntegers(int n) {
            for(int i=1;i<=n/2;i++){
                if(!containsZero(n-i)&&!containsZero(i))
                    return new int[]{n-i,i};
            }
            return new int[]{n-1,1};
        }
        public boolean containsZero(int i){
            while(i!=0){
                if(i%10==0)
                    return true;
                i=i/10;
            }
            return false;
        }
    }
}
