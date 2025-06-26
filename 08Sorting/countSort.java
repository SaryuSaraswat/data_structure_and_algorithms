public class countSort{

    public static void countSort(int [] arr){
        //write code from here

        int n = arr.length;

        int mx = Integer.MIN_VALUE;
        for(int i =0; i<n; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        
        int [] freqArray = new int [mx + 1];
        int m = freqArray.length;

        for(int i =0; i<m; i++){
            int element = arr[i];
            freqArray[element]++;
        }

        
        int k = 0;
        for(int i = mx; i >= 0; i-- ){
            int count = freqArray[i];
            for(int j =1; j<= count; j++){
                arr[k] = i;
                k++;
            }
        }

        System.out.println("Sorted in descending order " + " ");

        for(int i =0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String [] args){
        int [] arr = {6, 6, 4, 5, 1, 5, 1};

        countSort(arr);
    }
}