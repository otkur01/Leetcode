import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));


    }

    public static boolean Loop(int n){
        if(n==1) return true;
        int sum = 0;
        while (n!=0){
            int digit = n%10;
            sum+=digit*digit;
            n=n/10;
        }
     return sum>1 && sum<10 ?false: Loop(sum);

    }
    public static boolean isHappy2(int n) {
       int sum = 0;

       while (n!=0){
            int digit = n%10;
            sum+=digit*digit;
            n=n/10;
       }




   return Loop(sum);
    }

    public static boolean isHappy(int n) {
        Set<Integer> mp= new HashSet<>();
        while(true)
        {
            int sum=0;
            while(n!=0)
            {
                sum+=Math.pow(n%10,2.0);
                n=n/10;
            }
            if(sum==1)
            {
                return true;
            }
            n=sum;
            if(mp.contains(n))
            {
                return false;
            }
            mp.add(n);
        }
    }


}
