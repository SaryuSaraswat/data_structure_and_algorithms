
//Question 5: Write a Java program that takes a year from the user and print whether that year is a leap year or not.

import java.util.*;

public class Q5{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n % 4 == 0){ 
           System.out.println(n + " is a leap year.");
        }else{
           System.out.println(n + " is not a leap year.");
        }
    }
}
