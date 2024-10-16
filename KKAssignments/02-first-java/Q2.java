//Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class Q2{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        System.out.println("My name is " + str);
    }
}