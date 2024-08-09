import java.util.Scanner;

public class takingInput{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int [] array = new int [4];
        array[0] = sc.nextInt();
        array[1] = sc.nextInt();
        array[2] = sc.nextInt();

        System.out.println("Physics : " + array[0]);
        System.out.println("Chemistry : " + array[1]);
        System.out.println("Maths : " + array[2]);

        //print length of array
        int n = array.length;
        System.out.println(n);
    }
}