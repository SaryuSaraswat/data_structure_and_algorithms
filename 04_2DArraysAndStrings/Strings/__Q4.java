/*
Question 4 : Determine if 2 Strings are anagrams of each other.
What are anagrams? 
If two strings contain the same characters but in a different order,they can be said
to be anagrams. Consider race and care.

Checkiftwostringsare anagrams or not
*/

import java.util.*;

public class __Q4{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str1 = "race";
        String str2 = "care";

        boolean ans = true;
        if(str1.length() != str2.length()){
            ans = false;
        }else{
            for(int i =0; i<str1.length(); i++){
                if(str1.contains(str2.charAt(i) + "")){
                    ans = true;
                }
            }
        }
        
        System.out.println(ans);
    }
}