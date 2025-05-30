import java.util.Scanner;

public class _17{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n;

        int rev = 0;
        while(temp > 0){
            int digit = temp % 10;
            rev = rev*10 + digit;
            temp /= 10;
        }

        if(n == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

    }
}

//45 = 4*10 + 5
//454 = 4*100 + 5 *10 + 4
//454 => 0*10 + 4 => 4
//       4*10 + 5 => 45
//       45*10 + 4 =< 454