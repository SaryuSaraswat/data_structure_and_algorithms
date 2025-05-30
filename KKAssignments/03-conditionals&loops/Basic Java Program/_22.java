import java.util.Scanner;

public class _22{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int product = 1;
        while(temp > 0){
            int digit = temp%10;
            product *= digit;
            temp /= 10;
        }

        temp = n;
        int sum = 0;
        while(temp > 0){
            int digit = temp%10;
            sum += digit;
            temp /= 10;
        }

        int res = product - sum;
        System.out.println(res);

    }
}