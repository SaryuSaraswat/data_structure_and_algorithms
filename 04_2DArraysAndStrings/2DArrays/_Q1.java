/*
Question 1 : Print the number of 7's that are in the 2d array.

Example : 
Input - int[][] array = { {4,7,8},{8,8,7} };
Output - 2

*/

public class _Q1{

    public static void CountTarget(int [][] matrix, int target){
        
        int count = 0;
        for(int i =0; i<matrix.length; i++){
            for(int j =0; j<matrix[0].length; j++){
                if(matrix[i][j] == target){
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    public static void main(String [] args){
        int [][] matrix = { {4,7,8},{8,8,7} };
        int target = 7;

        CountTarget(matrix, target);
    }
}