public class ReverseStringByStream {
    public static void main(String[] args) {
        String str = "abckjdfjkdf";
        System.out.println("the reversed string is " + ReveesedString(str));
    }

    public static String ReveesedString(String str) {
        String reversed = str.chars()
                .mapToObj(c-> String.valueOf((char) c)).reduce((c1,c2)->c2+c1).orElse("");

      return reversed;
    }
}
