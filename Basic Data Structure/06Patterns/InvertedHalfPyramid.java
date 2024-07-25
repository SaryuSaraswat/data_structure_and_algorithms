import java.util.Scanner;

public class InvertedHalfPyramid{

    public static void pattern(int n){

        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=n; col++){
                if(row + col <= n+1){
                    System.out.print(col);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        pattern(n);
    }
}

/*
11 12 13 14 
21 22 23 24
31 32 33 34 
41 42 43 44
*/