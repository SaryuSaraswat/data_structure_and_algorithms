//Find largest number from three numbers 

import java.util.Scanner;
import java.util.*;

public class largestNum{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int max = Math.max(n3, Math.max(n1, n2));
        System.out.print(max);
    }
}