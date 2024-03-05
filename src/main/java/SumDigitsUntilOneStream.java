public class SumDigitsUntilOneStream {
    public static void main(String[] args) {
      int n = 493193;
        System.out.println(SumofDigis(n));

    }

    public static int SumofDigis(int n){
        int sumDigits = String.valueOf(n)
                .chars().map(Character::getNumericValue).sum();

         while (sumDigits>9){
             sumDigits = String.valueOf(sumDigits)
                     .chars().map(Character::getNumericValue).sum();
         }
     return sumDigits;
    }



}
