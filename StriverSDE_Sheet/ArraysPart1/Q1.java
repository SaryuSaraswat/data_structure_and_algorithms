//Set matrix zero

import java.util.*;

public class Q1{

    public static void setMatrixZero(int [][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;

        int [] row = new int [n];
        int [] col = new int[m];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(row[i] == 1 || col[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
        
    }


    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of row");
        int n = sc.nextInt();
        System.out.println("Enter size of col");
        int m = sc.nextInt();
        int [][] matrix = new int [n][m];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        setMatrixZero(matrix);
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}