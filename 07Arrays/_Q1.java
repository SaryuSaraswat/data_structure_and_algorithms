/*
Question 1:
Given an integer array nums, return true if any value appears at least twice in the array, 
and return false if every element is distinct.

Example 1: 
Input: nums = [1, 2, 3, 1]
Output:   true 

Example 2:
Input: nums = [1, 2, 3, 4]
Output:   false 

Example 3:
Input: nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
Output:   true 

Constraints:
    • 1 <= nums.lengtth <= 105
    • -109 <= nums[ i ] <= 109
*/
import java.util.Scanner;

public class _Q1{

    public static boolean result(int [] arr){
        int n = arr.length;
        for(int i =0; i<n - 1; i++){
            for(int j = i + 1; j<n; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");
        int n = sc.nextInt();

        int [] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(result(arr));
    }
}