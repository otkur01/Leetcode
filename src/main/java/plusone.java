import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class plusone {
    public static void main(String[] args) {
      int []nums = {1,2,9};
        System.out.println(Arrays.toString(PlusOne(nums)));
    }
    public static int [] PlusOne(int [] digits){
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
