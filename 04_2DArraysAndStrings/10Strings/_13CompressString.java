public class _13CompressString{
    public static void main(String [] args){
        String str = "abcc";
        String newStr = "";

        for(int i =0; i<str.length(); i++){
            Integer count = 1;
            while(i < str.length() - 1 && str.charAt(i) == str.charAt(i+1)){
                i++;
                count++;
            } 

            newStr += str.charAt(i);
            if(count > 1){
                newStr += count.toString();
            }
        }

        System.out.println(newStr);
    }
}