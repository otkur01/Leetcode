import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>>result = new ArrayList<>();
        while (numRows>=0){
            List<Integer>result1 = new ArrayList<>();
            result1.add(1);
            for (int i = 1; i <= numRows; i++) {
                List<Integer>temp = new ArrayList<>();
                temp.add(1);
                for (int i1 = 1; i1 < result.size(); i1++) {
                    temp.add(result1.get(i1-1)+result1.get(i1));
                }
                temp.add(1);
                result1=temp;

            }
            numRows--;
          result.add(result1);
        }


     return result;
    }

    public static List<Integer> generate1(int numRows) {
        List<Integer>result = new ArrayList<>();
        result.add(1);
        for (int i = 1; i <= numRows; i++) {
            List<Integer>temp = new ArrayList<>();
            temp.add(1);
            for (int i1 = 1; i1 < result.size(); i1++) {
                temp.add(result.get(i1-1)+result.get(i1));
            }
           temp.add(1);
            result=temp;

        }





       return result;
    }
}
