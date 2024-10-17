
//calculate discount of product

import java.util.*;

public class Q4{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double discountPercent = sc.nextInt();

        double discount = (discountPercent/100) * n;
        System.out.println(discount);
    }
}