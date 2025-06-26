//program to reverse number

import java.util.*;

public class ReverseNum{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rev = 0;

        while(n > 0){
            rev = n % 10 + rev * 10;
            n = n/10;
        }

        System.out.println(rev);
    }
}

