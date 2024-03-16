public class ReverseWordsString {
    public static void main(String[] args) {
        String s ="a good   example";
        System.out.println(reverseWords(s));


    }


    public  static String reverseWords(String s) {
        s =s.trim().replaceAll("\\s{2,}", " ");
        String [] str = s.split(" ");
        for (int i = 0; i < str.length/2; i++) {
              String temp ="";
              temp = str[i];
              str[i]=str[str.length-1-i];
              str[str.length-1-i]=temp;
        }
         String result = "";
        for (int i = 0; i < str.length; i++) {
            result+=str[i]+ " ";
        }
        return result.trim();
    }
}
