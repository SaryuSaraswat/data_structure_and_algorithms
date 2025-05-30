import java.util.Scanner;

public class _07{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int first = 0;
        int second = 1;
        
        if (n >= 1) System.out.print(first + " ");
        if (n >= 2) System.out.print(second + " ");

        while(n-2 > 0){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third; 
            n--;   
        }
    }
}

//0 1 1 2 3 5 8 ...