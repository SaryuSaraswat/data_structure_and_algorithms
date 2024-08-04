public class sumOfSubarrays{

    public static void sum(int [] arr){

        int currSum = 0;

        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for(int i =0; i<=arr.length - 1; i++){
            int start =i;
            for(int j =i; j<=arr.length - 1; j++){
                int end = j;
                currSum = 0;
                for(int k = start; k <= end; k++){
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
                if(minSum > currSum){
                    minSum = currSum;
                }
            }
        }

        System.out.println("Maximum sum : " + maxSum);
        System.out.println("Minimum sum : " + minSum);
    }

    public static void main(String [] args){
        int [] arr = {1, -2, 6, -1, 3};

        sum(arr);
    }
}