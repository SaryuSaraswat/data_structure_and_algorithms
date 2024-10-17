
//Calculate CGPA 

import java.util.*;

public class Q10{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n >= 1 && n<= 100){
            System.out.println(n/9.5);
        }else{
            System.out.println("Invalid input");
        }

        
    }
}