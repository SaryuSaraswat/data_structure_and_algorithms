
//armstrong number

import java.util.Scanner;

public class _09{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number;

        int count = 0;
        while(temp>0){
            count++;
            temp /= 10;
        }

        int sum = 0;
        temp = number;
        while(temp > 0){
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp /= 10;
        }

        if(number == sum){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}

/* 
153 
3 1
5 2
1 3
0 3

*/