public class reverse{

    public static void revArray(int [] arr ){
        
        int start = 0;
        int last = arr.length - 1;
        int temp = arr[last];
        arr[last] = arr[start];
        arr[start] = temp;
        start++;
        last--;

    }

    public static void main(String [] args){
        int [] arr = {2, 4, 6, 8, 10, 12};
        int key = 48;

        revArray(arr);
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}