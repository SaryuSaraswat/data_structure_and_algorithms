public class sumOfsubarraysUsingPrefixSum{

    public static void maxSum(int arr []){

        int n = arr.length;
        int currSum = 0;
        int maximumSum = Integer.MIN_VALUE;

        int [] prefixSum = new int [n];
        prefixSum [0] = arr[0];
        
        //compute prefixsum
        for(int i = 1; i<n; i++){
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        
        //find max of subarrays
        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                currSum = (i == 0) ? prefixSum[j] :  prefixSum[j] - prefixSum[i - 1];
                if(maximumSum < currSum){
                    maximumSum = currSum;
                }
            }
            
        }

        System.out.println( "maximumSum : " + maximumSum);

    }

    public static void main(String [] args){
        int [] arr = {1, -2, 6, -1, 3};

        maxSum(arr);
    }
}