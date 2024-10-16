
//To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Q8{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int n = str.length();
        for(int i = 0; i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                System.out.print(false);
            }else{
                System.out.print(true);
            }
        }
        
    }
}