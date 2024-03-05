import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {
    public static String  convert(String s, int numRows) {
        List<List<Character>> dataList = new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            List<Character> arr = new ArrayList<>();

            dataList .add(arr);
        }
        System.out.println(dataList);
        char [] chars = s.toCharArray();// "P A Y P A L I S H I  R  I  N  G:  A Y P L I S I  R  I  G  : Y I R
                                        //  0 1 2 3 4 5 6 7 8 9 10 11 12 13
                                        // P  A  H  N     A  P   L  S   I   I   G  Y  I  R
         int revers = numRows;
         int index =0;
         while (index<s.length()) {
             for (int i = 0; i < numRows; i++) {
                 dataList.get(i).add(s.charAt(index));
                 index++;
             }
             for (int i = numRows - 1; i <= 0; i--) {
                 dataList.get(i).add(s.charAt(index));
                 index++;
             }
             if (index==s.length())break;
         }

        System.out.println(dataList);
       return "";
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        convert(s,2);

    }


}
