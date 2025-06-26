
import java.util.Scanner;

public class linearSearch{

    public static int returnIndex(int [] arr, int k){
        int ans = -1;
        for(int i =0; i<arr.length; i++){
            if(arr[i] == k){
                ans = i;
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
        
        System.out.println("Enter element");
        int k = sc.nextInt();

        int result = returnIndex(arr, k);
        System.out.println(result);
    }
}