public class MinimumNumberOfPushesToTypeWord1 {
    public static int minimumPushes(String word) {
        int count = word.length();
        if(count<=8)return count;
      else if (count<=16) {
          return 8+(count-8)*2;
      } else if (count<=24) {
            return 24+(count-16)*3;
        }
        else if (count<=32) {
            return 48+(count-24)*4;
        }
        return count;
    }

    public static void main(String[] args) {
        String s ="amrvxnhsewkoipjyuclgtdbfq";
        System.out.println(minimumPushes(s));
    }

}
