import java.util.Scanner;

public class _21{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int first = 0;
        int second = 1;

        if(n>=1){ System.out.print(first + " "); }
        if(n>=2){ System.out.print(second + " "); }

        int count = 2;
        while(count < n){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
            count++;
        }
    }
}
