import java.util.Scanner;

public class hollowSquare{

    public static void pattern(int n, int m){
        for(int i = 1; i<=n; i++){
            for(int j= 1; j<=m; j++){
                if(i == 1 || i==n || j==1 || j == m){
                    System.out.print("*" );
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        pattern(n,m);
    }
}