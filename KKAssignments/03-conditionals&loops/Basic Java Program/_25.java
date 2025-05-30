import java.util.Scanner;

public class _25{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = n;
        while(n != 0){
            max = Math.max(max, n);
            n = sc.nextInt();
            if(n == 0){
                System.out.println(max);
            }
        }

    }
}