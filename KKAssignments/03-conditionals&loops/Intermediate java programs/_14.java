import java.util.Scanner;

public class _14{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n;
        int count = 0;
        while(temp > 0){
            int digit = temp%10;
            count++;
            temp /= 10;
        }

        temp = n;
        int sum = 0;
        while(temp > 0){
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp/= 10;
        }

        if(n == sum){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}