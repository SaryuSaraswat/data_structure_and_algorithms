public class _06checkPalindrome{

    public static void checkPalindrome(String str){
        boolean ans = true;
        for(int i =0; i<str.length()/2; i++){
            int n = str.length();

            if(str.charAt(i) != str.charAt(n - 1 -i)){
                ans = false;
            }
        }

        System.out.println(ans);
    }

    public static void main(String [] args){
        String str = "race";
        checkPalindrome(str);
    }
}