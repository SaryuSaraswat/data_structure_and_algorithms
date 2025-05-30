import java.util.Scanner;

public class _08{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str= sc.next();

        String rev = "";
        for(int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }

            if(str.equals(rev)){
                System.out.println("yes it is a palindrome");
            }else{
                System.out.println("no, it is not a palindrome");
            }
    
    }
}