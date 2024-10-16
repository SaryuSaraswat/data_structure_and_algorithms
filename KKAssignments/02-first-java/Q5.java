//Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class Q5{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if(n1 > n2){
            System.out.print(n1);
        }else{
            System.out.print(n2);
        }
        
    }
}