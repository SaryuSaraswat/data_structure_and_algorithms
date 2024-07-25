//checkPalindrome

import java.util.Scanner;

public class Q3{

    public static boolean isPalindrome(int a){
        //12321 -> 12321


















    
        int originalA = a;
        int rev = 0;
        while(a > 0){
            rev = rev * 10 +  a % 10;
            a = a/10; 
        } 
        

        if(rev == originalA){
            return true;
        }

        return false;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isPalindrome(n));
    }
}