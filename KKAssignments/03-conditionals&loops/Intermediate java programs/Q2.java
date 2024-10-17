
//calculate electricity bill

import java.util.*;

public class Q2{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter previous bill");
        int pbill = sc.nextInt();
        System.out.println("Enter this month bill");
        int tbill = sc.nextInt();
      
        System.out.println(tbill - pbill);
    }
}
