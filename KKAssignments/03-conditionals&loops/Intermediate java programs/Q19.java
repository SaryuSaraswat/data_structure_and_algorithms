
//hcf and lcm of two numbers

import java.util.*;

public class Q19{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int min = (int)Math.min(num1, num2);
        int hcf = -1;
        for(int i=min; i>0; i--){
            if(num1 % i == 0 && num2 % i == 0){
                hcf = i;
                break;
            }
        }

        int lcm = num1 * num2 / hcf;


        System.out.println("HCF : " + hcf + " LCM : " + lcm);
    }
}