import java.util.Arrays;

public class mergeKArrays{

    public static void mergeKArrays(int [][] arr, int N, int [] output){
        int c = 0;
        for(int i = 0; i<N; i++){
            for(int j = 0; j<arr[0].length; j++){
                output[c++] = arr[i][j];
            }
        }

        Arrays.sort(output);
    }

    public static void printArray(int [] output, int size){
        for(int i = 0; i<size; i++){
            System.out.print(output[i] + " ");
        }
    }

    public static void main(String [] args){
        int arr [] [] = { 
                          { 2, 6, 12, 34 },
                          { 1, 9, 20, 1000 },
                          { 23, 34, 90, 2000 } 
                        };

       int K = 4;
       int N = 3;
       int [] output = new int[N * K];

       mergeKArrays(arr, N, output);

       System.out.println("Merged arrays are :" );
       printArray(output, N*K);

    }
}