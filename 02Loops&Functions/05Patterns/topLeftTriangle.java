//print topLeftTriangle pattern

/*
*****
****
***
**
*

*/
import java.util.*;

public class topLeftTriangle{

    public static void trianglePattern(int n){

       for(int row =1; row<=n; row++){
            for(int col =1; col<=n; col++){
                if(row + col <= n + 1){ 
                  System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
       }

        // for(int i =1; i<=n; i++){
        //     for(int j =i; j<=n; j++){
        //         System.out.print("*" + " ");
        //     }
        //     System.out.println();
        // }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        trianglePattern(n);
    }
}