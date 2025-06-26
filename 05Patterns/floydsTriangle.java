import java.util.*;

public class floydsTriangle{

    public static void trianglePattern(int n){
        
        int count = 1;
        // for(int row =1; row<=n; row++){
        //     for(int col =1; col<=n; col++){
        //         if(row >= col){ 
        //            System.out.print(count + " ");
        //            count++;
        //         }
                
        //     }
        //     System.out.println();
        // }

        for(int i = 1; i<=n ; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(count + " ");
                count++;
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