
//perfect number

import java.util.*;

public class Q22{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;

        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }

        if(sum == temp){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}