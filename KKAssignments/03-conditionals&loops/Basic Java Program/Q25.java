
//Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.*;

public class Q25{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int max = n;
        while(n != 0){
            n = sc.nextInt();
            max = Math.max(max, n);
            
        }
        System.out.println(max);
    }
}
