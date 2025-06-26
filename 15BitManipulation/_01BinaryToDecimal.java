//101 => 1* 2^2 + 0* 2^1 + 1*2^0 => 4+0+1 => 5

public class _01BinaryToDecimal{

    public static void BinToDeci(int n){
        int sum = 0;
        int i = 0;
        while(n > 0){
            int mod = n % 10;
            sum += mod * Math.pow(2, i);
            n = n/10;
            i++;
        }
        System.out.println(sum);

    }

    public static void main(String [] args){
        int n = 101;
        BinToDeci(n);
    }
}