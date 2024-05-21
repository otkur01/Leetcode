public class climbStrairs {
    public static void main(String[] args) {

        System.out.println(climbStairs(10));
        System.out.println(climbStairs1(10));


    }



    public static int climbStairs(int n) {
      if(n==1)return 1;
      if(n==2)return 2;


       return climbStairs(n-1)+ climbStairs(n-2);

    }

    public static int climbStairs1(int n) {
        if(n <= 1){
            return n;
        }
        int prev1 = 1, prev2 = 1;
        int current = prev1 + prev2;
        for(int i = 2; i <= n; i++){
            current = prev1+prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }
}
