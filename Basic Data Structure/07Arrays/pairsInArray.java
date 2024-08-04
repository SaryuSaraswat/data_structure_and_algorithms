public class pairsInArray{

    public static void pairs(int [] arr ){
        
        int totalPairs = 0;
        for(int i =0; i<=arr.length - 1; i++){
            int curr = arr[i];
            for(int j = i+1; j<=arr.length - 1; j++){
                System.out.print("(" + curr + ", " + arr[j] + ")" + " ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs : " + totalPairs);
    }

    public static void main(String [] args){
        int [] arr = {2, 4, 6, 8, 10, 12};
        int key = 48;

        pairs(arr);
        
    }
}