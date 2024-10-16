
//Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class Q1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}