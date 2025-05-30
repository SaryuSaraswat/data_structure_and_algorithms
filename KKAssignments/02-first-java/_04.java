import java.util.Scanner;

public class _04{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        char operator = sc.next().charAt(0);

        
        if(operator == '+'){
            System.out.println(n1 + n2);
        }else if(operator == '-'){
            System.out.println(n1 - n2);
        }else if(operator == '*'){
            System.out.println(n1 * n2);
        }else if(operator == '/'){
            System.out.println(n1/ n2);
        }


        
    }
}