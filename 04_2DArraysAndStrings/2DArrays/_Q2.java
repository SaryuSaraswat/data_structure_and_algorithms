/*
Question 2 : Print out the sum of the numbers in the second row of the “nums” array.

Example : 1
Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
Output - 18

*/

public class _Q2{

    public static void SumOfNumsRow(int [][] matrix, int nums){
        
        int sum = 0;
        for(int  j=0; j<matrix[0].length; j++){
            sum += matrix[nums-1][j];
        }

        System.out.println(sum);
    }

    public static void main(String [] args){
        int [][] matrix = { {1,4,9},{11,4,3},{2,2,3} };
        int nums = 2;

        SumOfNumsRow(matrix, nums);
    }
}