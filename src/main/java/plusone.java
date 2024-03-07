import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class plusone {
    public static void main(String[] args) {
      int []nums = {1,2,3};
        System.out.println(Arrays.toString(PlusOne(nums)));
    }
    public static int [] PlusOne(int [] digits){
        List<Integer>list = new ArrayList<>();
        for (int i = 0; i < digits.length; i++) {
             list.add(digits[i] );
        }
        for (int i = digits.length-1; i >=0; i++) {
            if(list.get(i)+1>10){
                list.set(i, (list.get(i)+1)%10);
                list.set(i+1,(list.get(i)+1)/10);
            }
            else {
                list.set(i, list.get(i));
            }
        }

        int [] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i]= list.get(i);
        }
       return result;
    }
}
