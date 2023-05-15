package May;

public class May15 {
    /*
    1491. Average Salary Excluding the Minimum and Maximum Salary
Easy
2K
174
Companies
You are given an array of unique integers salary where salary[i] is the salary of the ith employee.

Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.



Example 1:

Input: salary = [4000,3000,1000,2000]
Output: 2500.00000
Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500
Example 2:

Input: salary = [1000,2000,3000]
Output: 2000.00000
Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
Average salary excluding minimum and maximum salary is (2000) / 1 = 2000
     */
    public static void main(String[] args) {
        System.out.println(findAvgSal(new int[]{8000,9000,2000,3000,6000,1000}));
    }

    public static double findAvgSal(int [] salary){
        int min = salary[0];
        int max = salary[1];
        double sum = 0;
        int count = 0;

        for (int i = 0; i < salary.length; i++) {
            if(salary[i] < min)
                min = salary[i];
            if(salary[i] > max)
                max = salary[i];
        }
        for (int i = 0; i < salary.length ; i++) {
            if(salary[i] != min && salary[i] != max){
                sum += salary[i];
                count++;
            }
        }
        return (sum/count);
    }
}
