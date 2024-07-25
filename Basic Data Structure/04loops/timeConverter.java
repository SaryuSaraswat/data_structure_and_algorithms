import java.util.*;

public class timeConverter{

    public static void timeConverterProblem(int month,int day, int hour, int minute){
        //input time is GMT format -> convert it into IST(indian standard time)
        //to convert GMT + 5 : 30 minutes -> IST 
        
        hour += 5;
        minute += 30;

        if(minute >= 60){
            hour++;
            minute = minute -60;
        }
        if(hour >= 24){
            day++;
            hour = hour - 24;
        }
        if(day >= 30){
            month++;
            day = day - 30;
        }
        
        System.out.print("Month : " + month + ", Day : " + day + ", Hour : " + hour + ", Minute : " + minute);


    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int month = sc.nextInt();
        int day = sc.nextInt();
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        
        timeConverterProblem(month, day, hour, minute);
    }
}