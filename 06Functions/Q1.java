//average of three numbers 

import java.util.Scanner;

public class Q1{

    public static void sum(int a, int b, int c){
        int average = (a + b + c)/3;
        System.out.println(average);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sum(a, b , c);
    }
}