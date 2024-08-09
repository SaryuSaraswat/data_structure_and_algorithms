//checkPalindrome

import java.util.Scanner;

public class Q4{

    public static void MathFunction(double a, double b, double c){
        double max = Math.max(a, b);
        System.out.println("Maximum element is : " + max);

        double min = Math.min(a, b);
        System.out.println("Minimum element is : " + min);

        double sqrt = Math.sqrt(a);
        System.out.println("SquareRoot is : " + sqrt);

        double pow = Math.pow(a, b);
        System.out.println("Power is : " + pow);

        double abs = Math.abs(c);
        System.out.println("Absolute value is : " + abs);

    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double m = sc.nextDouble();
        double o = sc.nextDouble();
        
        MathFunction(n, m, o);
        
    }
}