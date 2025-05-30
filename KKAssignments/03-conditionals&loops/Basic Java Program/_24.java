import java.util.Scanner;

public class _24{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n != 0){
            sum += n;
            n = sc.nextInt();
            if(n == 0){
                System.out.println(sum);
            }
        }

        

    }
}