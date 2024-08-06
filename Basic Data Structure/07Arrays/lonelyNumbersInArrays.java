import java.util.*;

public class lonelyNumbersInArrays{

    public static void result(int [] arr){
        //write your code here
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();

        for(int i =0; i<n; i++){
            boolean hasNeighbour = false;

            for(int j =0; j<n; j++){
                if(arr[j] == arr[i] +1 || arr[j] == arr[i] - 1){
                    hasNeighbour= true;
                    break;
                }
            }
            if( !hasNeighbour){
                res.add(arr[i]);
            }
        }

        for(int i = 0; i<res.size(); i++){
            System.out.println(res.get(i));
        }
    }

    public static void main(String [] args){
        int arr [] = {10, 6, 5, 8};

        result(arr);
    }
}