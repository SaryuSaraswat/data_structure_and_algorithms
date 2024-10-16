
//write a program to check if the character is lowercase or uppercase

import java.util.Scanner;
import java.util.*;

public class checkCase{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.print("Lowercase");
        }else{
            System.out.print("Uppercase");
        }

    }
}