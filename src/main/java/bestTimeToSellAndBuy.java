import java.util.HashSet;
import java.util.Set;

public class bestTimeToSellAndBuy {
    public static void main(String[] args) {
        int[] arr= {7,1,5,3,6,4};
        int[] arr1= {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
        System.out.println(maxProfit1(arr1));
    }
    public static int maxProfit(int[] prices) {
      int max =0;

        for (int i = prices.length - 1; i >= 0; i--) {
            for (int i1 = i; i1 >= 0; i1--) {
              if (max<prices[i]-prices[i1])max=prices[i]-prices[i1];

            }
        }







  return max;
    }

    public static int maxProfit1(int[] prices) {
        if (prices.length == 0) return 0;

        int minPrice = prices[0], maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxProfit;
    }


}
