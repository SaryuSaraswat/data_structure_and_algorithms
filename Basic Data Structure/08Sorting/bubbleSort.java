public class bubbleSort{

    public static void Sort(int [] arr){
        //code
        int n = arr.length;
        for(int i =0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for(int i =0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String [] args){
        int [] arr = {6,4, 5, 1, 5, 1};

        Sort(arr);
    }
}