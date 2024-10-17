
//check leap year or not

import java.util.*;

public class Q23{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n % 100 == 0 && n % 4 == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        
    }
}