/*
Question 3 :
Write a program to Find Transpose of a Matrix. 
What is Transpose? 
Transpose of a matrix is the process of swapping the rows to columns. 
For a 2x3 matrix, 

Matrix  a11    a12    a13
        a21    a22    a23

Transposed Matrix
        a11    a21
        a12    a22
        a13    a23
*/

import java.util.*;

public class _Q3{

    public static void transposeMatrix(int [][] array){
        int row = array.length;
        int col = array[0].length;
        
        int [][] transposeArray = new int [col][row];
        for(int i =0; i<col; i++){
            for(int j =0; j<row; j++){
                transposeArray[i][j] = array[j][i];
            }
        }

        printArray(transposeArray);

    }

    public static void printArray(int [][] array){
        for(int i =0; i<array.length; i++){
            for(int j =0; j<array[0].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of row");
        int row = sc.nextInt();

        System.out.println("Enter no. of col");
        int col = sc.nextInt();

        int [][] array = new int[row][col];
        System.out.println("Enter values of row and cols");
        for(int i =0; i<row; i++){
            for(int j =0; j<col; j++){
                array[i][j] = sc.nextInt();
            }
        }
        // int [][] array= { {2,3,7}, {5,6,7} };

        transposeMatrix(array);

    }
}