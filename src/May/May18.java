package May;

import java.util.ArrayList;
import java.util.List;

public class May18 {
    public static void main(String[] args) {
        List<String> ops = new ArrayList<>();
        ops.add("5");
        ops.add("2");
        ops.add("C");
        ops.add("D");
        ops.add("+");

        System.out.println(res(ops));

        String [] operations = new String[]{"1","D","D","D"};
        System.out.println(calPoints(operations));
    }
    static int res(List<String> ops){
        int [] res = new int[ops.size()];
        int n=-1;
        for(String s : ops){
            if(s.equals("D")){
                n++;
                res[n] = res[n-1] * 2;
            }else if(s.equals("C")){
                res[n] = 0;
                n--;
            }else if(s.equals("+")){
                n++;
                res[n] = res[n-1]  + res[n-2];
            }else{
                n++;
                res[n] = Integer.parseInt(s);
            }
        }
        int sum=0;
        for (int i = 0; i <=n ; i++) {
            sum+=res[i];
        }
        return sum;
    }

    static int calPoints(String[] operations){
        int res [] = new int[operations.length];
        int n = -1;
        for (int i = 0; i < operations.length; i++) {
            if(operations[i].equals("D")){
                n++;
                res[n] = res[n-1] * 2;
            }else if(operations[i].equals("C")){
                res[n] = 0;
                n--;
            }else if(operations[i].equals("+")){
                n++;
                res[n] = res[n-1]  + res[n-2];
            }else{
                n++;
                res[n] = Integer.parseInt(operations[i]);
            }
        }
        int sum=0;
        for (int i = 0; i <=n ; i++) {
            sum+=res[i];
        }
        return sum;
    }
}
