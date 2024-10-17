
//Armstrong Number 

import java.util.*;

public class Q14{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int temp = n;

        int count = 0;
        while(n > 0){
            n = n/10;
            count++;
        }

        n = temp;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            int power = (int)Math.pow(rem, count);
            sum += power;
            n = n/10;
        }

        if(temp == sum){
            System.out.println("It is an armstrong number");
        }else{
            System.out.println("It is not an armstrong number");
        }

        
    }
}