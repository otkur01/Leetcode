public class BinaryStringBeautiful {
    public static int minChanges(String s) {
      int count =0;
        for (int i = 0; i < s.length(); i+=2) {
            if(s.charAt(i)!=s.charAt(i+1))count++;
        }return count;
    }

}
