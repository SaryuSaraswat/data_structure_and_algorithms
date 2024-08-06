/*
Question 4: 
Given n non-negative integers representing an elevation map where the width of each bar is 1, 
compute how much water it can trap after raining.

Example 1: 
Input : height = [0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1]
Output:   6 

Explanation : The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. 
In this case, 6 units of rain water (blue section) are being trapped.

Example 2 : 
Input : height = [4, 2, 0, 3, 2, 5]
Output:   9 

Constraints : 
• n == height . length
• 1 <= n <= 2 * 104
• 0 <= height [ i ] < = 105
*/

public class _Q4{

    public static int result(int [] arr){
        int n = arr.length;

        if(n <= 2){
            return -1;
        }

        //calculate leftMax
        int [] leftMax = new int [n];
        leftMax[0] = arr[0];
        for(int i =1; i<n; i++){
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }

        //calculate rightMax
        int [] rightMax = new int [n];
        rightMax[n-1] = arr[n-1];
        for(int j = n-2; j>=0; j--){
            rightMax[j] = Math.max(rightMax[j + 1], arr[j]);
        }
        
        int trappedWater = 0;
        for(int i =0; i<n; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - arr[i];

        }

        return trappedWater;
    }

    public static void main(String [] args){
        int [] arr = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};

        System.out.println(result(arr));
    }
}