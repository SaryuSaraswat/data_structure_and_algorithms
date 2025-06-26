//checkPalindrome

import java.util.Scanner;

public class Q5{

    public static int sum(int a){
        int sum = 0;

        for(int i=1; i<=a; i++){
            sum = sum + i;
        }

        return sum;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(sum(n));
    }
}