package May;

public class June2 {
    /*
    https://leetcode.com/problems/pass-the-pillow/solutions/3588016/brute-force-solution-using-one-loop/
     */
    public static void main(String[] args) {
        int n = 2;
        int time = 5;

        int timeTaken = 1, pos = 1;
        String mode = "forward";

        while(timeTaken < time){
            if(mode.equals("forward")){
                pos++;
            }else{
                pos--;
            }
            timeTaken++;
            if(pos == n){
                mode = "reverse";
            }
            if(pos == 1){
                mode = "forward";
            }
        }
        System.out.println(pos);

    }
}
