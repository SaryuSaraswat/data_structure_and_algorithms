//selection sort

//[3,6,2,1,8,7,4,5,3,1] => descending order

public class _Q2{

    public static void sort(int [] arr, int n){
        //code
        for(int i =0; i<n-1; i++){
            int pos = i;
            for(int j =i+1; j<n; j++){
                if(arr[j] > arr[pos]){
                    pos = j;
                }                
            }

            int temp = arr[pos];
            arr[pos] = arr[i];
            arr[i] = temp; 
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