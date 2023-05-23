package May;

public class May20 {
    public static void main(String[] args) {
        System.out.println(findSum(20));
    }

    private static int findSum(int numberOfDays) {


        int start = 1;
        int num = 1;
        int sum =0;
        int weekCounter = 0;
        for (int i =1; i <= numberOfDays; i++) {
           if(weekCounter == 7){
               System.out.println();
               weekCounter = 0;
               start += 1;
               num = start;
           }
            if(weekCounter != 0) {
                num++;
            }

            System.out.printf(num+" ");
            sum+=num;
            weekCounter++;
        }
        System.out.println();
        return sum;
    }





}
