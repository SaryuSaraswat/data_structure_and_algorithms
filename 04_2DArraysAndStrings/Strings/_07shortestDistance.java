/*
given a route containing 4 directions (E, W, N, S), find the shortest pa to reach destination.

input : "WNEENESENNN"
output : 5

*/

public class _07shortestDistance{

    public static void shortestDistance(String str){
        int x = 0;
        int y = 0;

        for(int i =0; i<str.length(); i++){
            if(str.charAt(i) == 'N'){
                y++;
            }else if(str.charAt(i) == 'S'){
                y--;
            }else if(str.charAt(i) == 'E'){
                x++;
            }else {
                x--;
            }
        }

        double X2 = x * x;
        double y2 = y * y;

        double shDis = Math.sqrt(X2 + y2);
        System.out.println(shDis);
    }

    public static void main(String [] args){
        String str = "WNEENESENNN";

        shortestDistance(str);
    }
}