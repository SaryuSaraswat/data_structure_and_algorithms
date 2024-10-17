
//reverse string

import java.util.*;

public class Q16{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String s = "";
        int n = str.length() - 1;
        for(int i = n; i>=0; i--){
            s += str.charAt(i);
        }

        System.out.println(s);
    }
}