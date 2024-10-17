
//Calculate Batting Average

import java.util.*;

public class Q9{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int totalRuns = sc.nextInt();
        int totalOuts = sc.nextInt();
        int totalNotOuts = sc.nextInt();

        int remRuns = totalRuns - totalNotOuts;
        int avg = remRuns / totalOuts;

        System.out.println(avg);
    }
}