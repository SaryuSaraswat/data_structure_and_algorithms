//count sort

//[3,6,2,1,8,7,4,5,3,1] => descending order

public class _Q4{

    public static void sort(int [] arr, int n){
        //code

        int mx = Integer.MIN_VALUE;
        for(int i =0; i<n; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }

        int [] count = new int[mx + 1];
        int m = count.length;
        for(int i =0; i<m; i++){
            int element = arr[i];
            count[element]++;
        }

        int k = 0;
        for(int i = mx; i>= 0; i--){
            int freq = count[i];
            for(int j = 1; j<= freq; j++){
                arr[k] = i;
                k++;                
            }

        }


    }
    
    public static void printArray(int [] arr, int n){
        for(int i =0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String [] args){
        int [] arr = {3,6,2,1,8,7,4,5,3,1};
        int n = arr.length;

        sort(arr, n);
        printArray(arr, n);
    }
}