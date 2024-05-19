import java.util.HashSet;
import java.util.Set;

public class UniqueNumberOccurrences {
    public static void main(String[] args) {
        int [] arr = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Set<Integer>set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int index = 0;
            int freq = 0;
            int temp = arr[i];
            while (freq<arr.length){
                if(temp==arr[freq++]){
                    index++;
                }

            }

            if(!set.add(index))return false;


        }


     return true ;
    }
}
