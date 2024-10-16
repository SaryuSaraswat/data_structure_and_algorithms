
//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Q7{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i = 0; i<n; i++){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}

//0 1 1 2 3 5 8 13 21