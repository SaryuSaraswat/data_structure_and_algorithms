//calculate factorial of number

import java.util.Scanner;

public class Q3{

    static int fact(int n){
        if(n == 0){
            return 1;
        }

        int ans = n * fact(n -1);
        return ans;
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fact(n));
    }
}

