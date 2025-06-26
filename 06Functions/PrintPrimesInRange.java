import java.util.Scanner;

public class PrintPrimesInRange{

    public static boolean prime(int n){
        if(n == 1) return false;

        if(n == 2) return true;

        for(int i =2; i<n-1; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void isPrime(int n){
        for(int i = 2; i<=n; i++){
            if(prime(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        isPrime(n);
    }
}