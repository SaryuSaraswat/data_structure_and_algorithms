
//Calculate Depreciation of Value

// A photographer owns a camera worth $10,000 and estimates using the equipment for five years with a zero salvage value.
// SYD depreciation the first year = (Remaining life span / SYD) x (Asset cost − Salvage value)
// Remaining life span = 5
// SYD = 1 + 2 + 3 + 4 + 5 = 15
// SYD depreciation the first year = (5 / 15) x ($10,000 − $0)
// SYD depreciation the first year = $3,333

import java.util.*;

public class Q8{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
         double assetCost = sc.nextInt();
         double years = sc.nextInt();
         double salvage = sc.nextInt();

        int sum = 0;
        for(int i=1; i<=years; i++){
            sum += i;
        }

        double depreciation = (years/sum) * (assetCost - salvage);

        System.out.println(depreciation);
    }
}