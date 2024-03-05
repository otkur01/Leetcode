public class SumOfdigitsUntilOneByString {
    public static void main(String[] args) {
    int n = 493193;
        System.out.println(SumOfDigitsUntilOne(n));


    }

    public static int SumOfDigitsUntilOne(int n){
        String str = String.valueOf(n);
        int sumDigits =0;
        for (int i = 0; i < str.length(); i++) {
            sumDigits+=Integer.parseInt(""+str.charAt(i));
        }
        int sumDigitsOne =10;
        String s = String.valueOf(sumDigits);
        while (sumDigitsOne>9){

            sumDigitsOne = 0;
            for (int i = 0; i < s.length(); i++) {
                sumDigitsOne+=Integer.parseInt(""+s.charAt(i));
            }
            if(sumDigitsOne>9){
                s = String.valueOf(sumDigitsOne);
            }

        }

      return sumDigitsOne;
    }

}
