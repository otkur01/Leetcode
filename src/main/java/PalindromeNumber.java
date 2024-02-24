public class PalindromeNumber {
    public static boolean PalindromeNumber(int x){
        if (x<0)return false;
        int a = x;
        int temp =0;
        int result =0;
        while(x!=0){
            result*=10;
            temp = x%10;
            result += temp;
            x=x/10;


        }
        if(a==result)return true;
        else return false;

    }

    public static void main(String[] args) {
        int a = 121;
        System.out.println(PalindromeNumber(a));
    }
}
