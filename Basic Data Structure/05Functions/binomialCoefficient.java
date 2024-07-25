import java.util.Scanner;

public class binomialCoefficient{

    public static int fact(int x){
        // if(x == 0){
        //     return 1;
        // }

        // int ans = x * fact(x-1);
        // return ans;

        int f = 1;
        for(int i = 1; i<=x; i++){
            f = f * i;
        }

        return f;
    }

    public static int binoCoeff(int n, int r){
         int factorialN = fact(n);
         int factorialR = fact(r);
         int factorialX = fact(n-r);

         int ans = factorialN / (factorialR * factorialX);

         return ans;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = binoCoeff(a, b);
        System.out.println(result);
    }
}