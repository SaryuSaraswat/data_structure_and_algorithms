
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class Q3{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        int time = sc.nextInt();
        int rate = sc.nextInt();

        double interest = (principal * rate * time)/100;
        System.out.print(interest);
    }
}