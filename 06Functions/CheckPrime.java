import java.util.Scanner;

public class CheckPrime{

    public static int prime(int n){
        if(n == 1) return 0;

        if(n == 2) return 1;

        for(int i =2; i<n-1; i++){
            if(n % i == 0){
                return 0;
            }
        }

        return 1;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(prime(n));
    }
}