//insertion sort

//[3,6,2,1,8,7,4,5,3,1] => descending order

public class _Q3{

    public static void sort(int [] arr, int n){
        //code
        for(int i =1; i<n; i++){
            int curr = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] < curr){
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = curr;
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