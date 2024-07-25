//print bottomLeftTriangle pattern

import java.util.*;

public class bottomLeftTriangle{

    public static void trianglePattern(int n){

        for(int i =1; i<=n; i++){
            for(int j =1; j<=n; j++){
                if(i >= j){ 
                   System.out.print("*" + " ");
                }
            }
            System.out.println();
        }

        // for(int i =1; i<=n; i++){
        //     for(int j =1; j<=i; j++){
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