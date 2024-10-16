//Input currency in rupees and output in USD.

import java.util.Scanner;

public class Q6{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        double dollar = n * 0.012;
        System.out.print(dollar);
    }
}