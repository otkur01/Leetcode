import java.util.Arrays;

public class ConstructTheRectangle {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(constructRectangle(122122)));
    }

    public static int[] constructRectangle(int area) {
        int len = 0;
        int wid = 0;
        int st = (int) Math.sqrt(area);
        for (int i = st; i > 0; i--) {
            if (area % i == 0) {
                wid = area / i;
                len = i;
                break;
            }
        }
        int [] result = {wid,len};
      return result;
    }

}
