public class PrintSubarrays{

    public static void subArrays(int [] arr){
        for(int i =0; i<arr.length - 1; i++){

            for(int j =0; j<arr.length - 1; j++){

                for(int k = i; k <= j; k++){
                    System.out.print(arr[k] + " ");
                }
                
                System.out.println();
            }
        }
    }

    public static void main(String [] args){
        int [] arr = {1, 2, 3, 4, 5};

        subArrays(arr);
    }
}