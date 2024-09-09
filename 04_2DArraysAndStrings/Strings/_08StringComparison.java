public class _08StringComparison{

    public static void StringComparison(String str1, String str2){
        System.out.println(str1.equals(str2));
    }

    public static void main(String [] args){
        String str1 = "abbcce";
        String str2 = "abbccde";

        StringComparison(str1, str2);
    }
}