//bubble sort

//[3,6,2,1,8,7,4,5,3,1] => descending order

public class _Q1{

    public static void sort(int [] arr, int n){
        //code
        for(int i =0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
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