//program to count repeated character

import java.util.*;

public class CountRepeatedNumber{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        int count = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem == x){
                count++;
            }
            n = n/10;
        }

        System.out.println(count);
    }
}