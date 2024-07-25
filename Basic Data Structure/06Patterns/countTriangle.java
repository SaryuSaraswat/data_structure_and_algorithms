import java.util.*;

public class countTriangle{

    public static void trianglePattern(int n){

        for(int row =1; row<=n; row++){
            for(int col =1; col<=n; col++){
                if(row >= col){ 
                   System.out.print(col);
                }
                
            }
            System.out.println();
        }

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        trianglePattern(n);
    }
}