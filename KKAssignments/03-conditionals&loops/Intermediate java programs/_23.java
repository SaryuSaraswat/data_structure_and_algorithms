import java.util.Scanner;

public class _23{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%100 == 0 && n%4 == 0){
            System.out.println("yes, it is a leap year");
        }else{
            System.out.println("no, it is not a leap year");
        }
    }
}