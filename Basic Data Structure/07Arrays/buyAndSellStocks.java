public class buyAndSellStocks{

    public static void maxProfit(int [] arr){
        int n = arr.length;
        int buyingPrice = Integer.MAX_VALUE;
        int maxProf = 0;

        for(int i = 0; i<n; i++){
            if(buyingPrice < arr[i]){
                int profit = arr[i] - buyingPrice;
                maxProf = Math.max(profit, maxProf);
            }else{
                buyingPrice = arr[i];
            }
        }

        System.out.println(maxProf);
    }

    public static void main(String [] args){
        int [] arr = { 7, 1, 5, 3, 6, 4};

        maxProfit(arr);
    }
}