import java.util.Scanner;

public class largestNumber{

    public static int result(int [] arr){
        int ans = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }

        return ans;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter array size");
        int n = sc.nextInt();

        int [] arr = new int [n];
        
        System.out.println("Enter array elements");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        

        int result = result(arr);
        System.out.println("Largest number : " + result);
    }
}