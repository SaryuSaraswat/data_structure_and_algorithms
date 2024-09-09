//n=> 10 ; 


public class _02DecimalToBinary{

    public static void DeciToBin(int n){
        int number = 0;
        int i = 1;
        while(n>0){
            int rem = n % 2;
            number += rem * i;
            n = n/2;
            i *= 10;
        }

        System.out.println(number);
    }

    public static void main(String [] args){
        int n = 10;
        DeciToBin(n);
    }
}
//8 => 