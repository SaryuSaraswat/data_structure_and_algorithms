//check if number is even or not

import java.util.Scanner;

public class Q2{

    public static boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        }
        return false;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isEven(n));
    }
}