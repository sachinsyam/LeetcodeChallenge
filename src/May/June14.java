package May;

import java.util.Arrays;

public class June14 {
    public static void main(String[] args) {
        String [] strs = new String[]{"flower","flow","flight"};

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length-1];

        int i = 0;
        while(i<first.length() && i<last.length()){
            if(first.charAt(i) == last.charAt(i)){
                i++;
            }else{
                break;
            }
        }
        System.out.println(first.substring(0,i));
    }
}
