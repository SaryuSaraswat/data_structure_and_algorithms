import java.util.Scanner;

public class BinaryToDecimal{

    public static void BinToDec(int n){
        int dec = 0;
        int pow = 0;

        while(n > 0){ 
           int lastDigit = n % 10;
           dec = dec + (lastDigit * (int)Math.pow(2, pow));
           pow++;
           n = n/10;
        }

        System.out.print(dec);
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        BinToDec(n);
    }
}