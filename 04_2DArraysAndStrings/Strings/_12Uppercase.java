public class _12Uppercase{
    public static void main(String [] args){
        String str = "hi i am saryu";
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i =1; i<str.length(); i++){
            int n = str.length();

            if(str.charAt(i) == ' ' &&  i < n -1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        
        String ans = sb.toString();
        System.out.print(ans);
    }
}