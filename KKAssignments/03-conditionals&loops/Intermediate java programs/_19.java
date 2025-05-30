import java.util.Scanner;

public class _19{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int hcf = 1;

        if(n1 < n2){
            for(int i = 1; i<=n1; i++){
                if(n1 % i ==0 && n2 % i == 0){
                    hcf = i;
                }
            }
        }else{
            for(int i = 1; i<=n2; i++){
                if(n1 % i ==0 && n2 % i == 0){
                    hcf = i;
                }
            }
        }

        System.out.print(hcf);
        
    }
}

//6 9 => 3
// 12 24 => 12