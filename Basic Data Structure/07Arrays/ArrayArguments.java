import java.util.Scanner;

public class ArrayArguments{

    public static void printMarks(int [] marks , int number){
        number = 10;

        for(int i =0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
        
    }

    public static void main(String [] args){

        int [] marks = {78, 89, 95};
        int number = 100;
        printMarks(marks, number);
        
        for(int i =0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        
        System.out.println(number);
        
        
    }
}