import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class findDisappearedNumbers {

    public static void main(String[] args) {
       int [] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumber(nums));
    }
    public static List<Integer> findDisappearedNumber(int[] nums) {
        List<Integer>list =new ArrayList<>();
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = 1; i < nums.length; i++) {
        if(!set.contains(i))list.add(i);
        }

        return list;
    }

}
