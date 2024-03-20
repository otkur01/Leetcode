public class ValidPalindrome {
    public static void main(String[] args) {
         String s = "9,8";
        System.out.println(isPalindrome(s));




    }

       public static boolean isPalindrome(String s) {
       s =s.toLowerCase();
        String result = "";
           for (int i = 0; i < s.length(); i++) {
               if(s.charAt(i)>='a' && s.charAt(i)<='z' ||(s.charAt(i)>='0' && s.charAt(i)<='9') )result+=s.charAt(i);
           }
           for (int i = 0,j=result.length()-1; i < result.length()/2;j--, i++) {
               if(result.charAt(i)!=result.charAt(j))return false;
           }

        return true;
    }
}
