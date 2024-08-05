public class kadanes{

    public static void maxSum(int [] arr){
        int n = arr.length;
        int currSum = 0;
        int maximumSum = Integer.MIN_VALUE;

        for(int i =0; i<n; i++){
            currSum += arr[i];
            if(currSum > 0){
                maximumSum = Math.max(maximumSum, currSum);
            }else{
                currSum = 0;
            }
        }

        System.out.println(maximumSum);
    }

    public static void main(String [] args){
        int [] arr = {1, -2, 6, -1, 3};

        maxSum(arr);
    }
}