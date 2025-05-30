import java.util.Scanner;

public class _26{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumOfNegative = 0;
        int sumOfPositive = 0;
        int sumOfPositiveOdd = 0;

        while(n != 0){
            if(n < 0){
                sumOfNegative += n;
            }
            if(n > 0){
                sumOfPositive += n;
            }
            if(!(n %2 ==0) && n>0){
                sumOfPositiveOdd += n;
            }
            n = sc.nextInt();
            if(n == 0){
                System.out.println("sum of negative " + sumOfNegative + " sum of positive " + sumOfPositive + " sum of oddPositive " + sumOfPositiveOdd);
            }
        }
    }
}