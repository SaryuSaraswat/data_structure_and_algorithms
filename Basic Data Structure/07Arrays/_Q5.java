/*
Question 5: 
Given an integer array nums, return all the triplets [nums[i], nums[j],  nums[k]] such that i != j, i != k, and j != k, 
and nums[i] + nums[j] + nums[k] == 0.Notice that the solution set must not contain duplicate triplets.

Example 1: 
Input : nums = [-1, 0,  1, 2, -1, -4]   
Output:   [ [-1, -1, 2] , [-1, 0, 1] ]

Example 2:
Input : nums = [ ]  
Output:   [ ]  

Example 3 : 
Input : nums = [ 0 ]  
Output:   [ ]  

Constraints:
• 0 <= nums.length <= 3000 
• -105 <= nums[i] <= 105

*/

import java.util.*;

public class _Q5{

    public static void result(int [] arr, int target){
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue; // Skip duplicate elements
            int j = i + 1, k = arr.length - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == target) {
                    res.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    while (j < k && arr[j] == arr[j + 1]) j++; // Skip duplicate elements
                    while (j < k && arr[k] == arr[k - 1]) k--; // Skip duplicate elements
                    j++;
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        for (List<Integer> triplet : res) {
            System.out.println(triplet);
        }
    }

    public static void main(String [] args){
        int [] arr = {-1, 0,  1, 2, -1, -4};
        int target = 0;

        result(arr, target);
    }
}