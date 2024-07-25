import java.util.*;

public class weekdayOrWeekend{

    public static String weekdayOrWeekendProblem(int n){
        
        switch (n){
            case 1 : 
            return "weekday";
            case 2 : 
            return "weekday";
            case 3 : 
            return "weekday";
            case 4 : 
            return "weekday";
            case 5 : 
            return "weekday";
            case 6 : 
            return "weekend";
            case 7 : 
            return "weekend";

            default :
            return "invalid input";
        }
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(weekdayOrWeekendProblem(n));
    }
}