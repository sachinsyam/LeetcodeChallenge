package May;
/*
1351. Count Negative Numbers in a Sorted Matrix
Easy
3.3K
93
Companies
Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.



Example 1:

Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.
Example 2:

Input: grid = [[3,2],[1,0]]
Output: 0

 */
public class May24 {
    public static void main(String[] args) {

    }
}
class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int i =0; i <grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j]<0){
                    count++;
                }
            }
        }
        return count;
    }
}


