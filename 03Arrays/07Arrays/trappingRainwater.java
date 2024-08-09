public class trappingRainwater{

    public static void maxRainWater(int [] arr){

        int n = arr.length;

        //calculate LeftMax of the array
        int [] leftMax = new int[n];
        leftMax[0] = arr[0];
        for(int i = 1; i<n; i++){
            leftMax[i] = Math.max(arr[i] , leftMax[i - 1]);
        }

        //calculate RightMax of the array
        int [] rightMax = new int [n];
        rightMax[n - 1] = arr[n - 1];
        for(int i = n -2; i>= 0; i--){
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }

        int trappedWater = 0;
        for(int i =0; i<n; i++){
            //calculate for waterLevel
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            //calculate trapped water
            trappedWater += waterLevel - arr[i];
        }

        System.out.println(trappedWater);
    }

    public static void main(String [] args){
        int [] arr = {4,2,0,6,3,2,5};

        maxRainWater(arr);
    }
}