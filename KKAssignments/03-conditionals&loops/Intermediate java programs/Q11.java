
//Compound Interest 
//formula : CI = P(1 + r/n)^n^t

import java.util.*;

public class Q11{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter the number of times interest applied per time period: ");
        double n = sc.nextDouble();

        System.out.print("Enter the time in years: ");
        double time = sc.nextDouble();

        double sb1 = rate / 100 / n;  
        double sb2 = 1 + sb1;
        double sb3 = Math.pow(sb2, n * time);
        double sb4 = principal * sb3;
        double compoundInterest = sb4 - principal;

        System.out.println(compoundInterest);
    }
}