import java.util.Scanner;

public class swap{

    public static void swapTwoNumbers(int x, int y){
        int temp = x;
        x = y;
        y = temp;
        
        System.out.println(x);
        
        System.out.println(y);
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        swapTwoNumbers(a, b);
    }
}