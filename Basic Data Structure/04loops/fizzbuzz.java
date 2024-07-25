import java.util.*;

public class fizzbuzz{

    public static String fizzbuzzProblem(int n){
        if(n % 3 == 0 && n % 5 == 0){
            return "fizzbuzz";
        }else if(n % 3 == 0){
            return "fizz";
        }else if(n % 5 == 0){
            return "buzz";
        }

        return String.valueOf(n);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fizzbuzzProblem(n));
    }
}