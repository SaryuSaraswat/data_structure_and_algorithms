//calculate sum of odd and even integers


import java.util.*;

public class Q2{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;
        
        while(n > 0){
            int rem = n % 10;
            if(rem % 2 == 0){
                evenSum += rem;
            }else{
                oddSum += rem;
            }

            n = n/10;
        }

        System.out.println("Sum of odd numbers : " + oddSum);
        System.out.println("Sum of even numbers : " + evenSum);
    }
}