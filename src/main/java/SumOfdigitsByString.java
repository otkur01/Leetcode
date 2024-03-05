public class SumOfdigitsByString {
    public static void main(String[] args) {
        int n = 123456789;
        System.out.println(SumofDigits(n));
    }

    public static int SumofDigits(int n){
         String str = String.valueOf(n);
         int sumDigits =0;
        for (int i = 0; i < str.length(); i++) {
            sumDigits+=Integer.parseInt(""+str.charAt(i));
        }

      return sumDigits;
    }


}
