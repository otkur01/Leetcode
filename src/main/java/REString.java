public class REString {

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(reverse(s));

    }

    public static String reverse( String str){
        StringBuilder s = new StringBuilder();
        for (int end = str.length()-1; end >=0; end--) {
           s.append(str.charAt(end));


        }


      return s.toString();
    }



}
