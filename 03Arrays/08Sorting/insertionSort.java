public class insertionSort{

    public static void Sort(int [] arr){
        //code
        int n  = arr.length;

        for(int i = 1; i<n; i++){
            int curr = arr[i];
            int j = i - 1;
            while(j >=0 && arr[j] > curr){
                arr[j + 1] = arr[j];
                j --;
            }

            arr[j + 1] = curr;
        }

        for(int i =0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String [] args){
        int [] arr = {6,4, 5, 1, 5, 1};
         //4 6 5 1 5 1
         //4 5 6 1 5 1
        Sort(arr);
    }
}