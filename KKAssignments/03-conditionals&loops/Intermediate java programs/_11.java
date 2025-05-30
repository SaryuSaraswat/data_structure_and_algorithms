import java.util.Scanner;

public class _11{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter principal");
        double principal = sc.nextDouble();

        System.out.println("enter rate in %");
        double rate = sc.nextDouble();

        System.out.println("enter time in years");
        double time = sc.nextDouble();

        System.out.println("enter no. of times interest will be compounded per year");
        double n = sc.nextDouble();

        double r = rate/100;
        double amount = principal * Math.pow((1 + r/n), n *time);

        double CI = amount - principal;
        System.out.println(CI); 
    }
}