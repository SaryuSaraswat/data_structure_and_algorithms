
//Find Ncr & Npr

import java.util.*;

public class Q15{

    public static int factorial(int n){
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact *= i;
        }

        return fact;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
                
        int permutation = factorial(n) / factorial(n-r);
        int combination = permutation / factorial(r);

        System.out.println(permutation + " , " + combination);
    }
}