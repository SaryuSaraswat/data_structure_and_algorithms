import java.util.Scanner;

public class product{

    public static int ProductOfTwoNumbers(int x, int y){
        return x *y;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = ProductOfTwoNumbers(a, b);
        System.out.println(result);
    }
}