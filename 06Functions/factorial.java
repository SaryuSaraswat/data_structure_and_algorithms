import java.util.Scanner;

public class factorial{

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

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = fact(n);
        System.out.println(result);
    }
}