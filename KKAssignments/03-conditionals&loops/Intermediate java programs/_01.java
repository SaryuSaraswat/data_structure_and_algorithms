import java.util.Scanner;

public class _01{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        int count = 1;
        while(count <= n){
            fact *= count;
            count++;
        }
        System.out.println(fact);
    }
}