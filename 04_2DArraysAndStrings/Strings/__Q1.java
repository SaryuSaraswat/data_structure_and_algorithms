/*
Question1: Count how many times lowercase vowels occurred in a String entered by the user
*/

import java.util.*;

public class __Q1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int count = 0;
        for(int i =0; i<str.length(); i++){
            if( str.charAt(i) != ' ' && str.charAt(i) == Character.toLowerCase(str.charAt(i))){
                if(str.charAt(i) == 'a' || str.charAt(i) == 'e'   ||  str.charAt(i) == 'i'|| str.charAt(i) == 'o' || str.charAt(i) == 'u' ){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
