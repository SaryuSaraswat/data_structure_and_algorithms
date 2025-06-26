import java.util.Scanner;

public class _0and1Triangle{

    public static void pattern(int n){

        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=n; col++){
                if(col <= row){
                    int sum = row + col;
                    if(sum % 2 == 0 ){ 
                       System.out.print(1);
                    }else{
                        System.out.print(0);
                    }
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

        pattern(n);
    }
}