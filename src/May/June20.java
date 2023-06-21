package May;

public class June20 {
    public static void main(String[] args) {
        String word1="abcd";
        String word2="pq";
        int idx1=0, idx2=0;

        int length1 = word1.length();
        int length2 = word2.length();

        int newLen = length1 + length2;
        String res = "";
        int mode = length1>0? 1 : 2;

        for (int i = 0; i < newLen; i++) {
            if(mode == 1){
                res = res + word1.charAt(idx1);
                idx1++;
                if(idx2 < length2) {
                    mode = 2;
                }
            }else{
                res = res + word2.charAt(idx2);
                idx2++;
                if(idx1 < length1) {
                    mode = 1;
                }
            }
        }

        System.out.println(res);
    }
}
