import java.util.Arrays;
import java.util.List;

public class SumOfDigitsByStream {
    public static void main(String[] args) {
      int n = 123;
        System.out.println(SumofDigitsByStream(n));

    }

    public static int SumofDigitsByStream(int n){
        int sumDigits = String.valueOf(n)
                .chars().map(Character::getNumericValue).sum();

     return sumDigits;
    }

}
