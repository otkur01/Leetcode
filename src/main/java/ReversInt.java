public class ReversInt {
    public static int ReversInt(int a){
        if(a<=-2147483648 || a >=2147483647)return 0;
         int b = a;
         if(a<0)a =a*(-1);
         int temp =0;
         int result =0;
         while(a!=0){
             result*=10;
             temp = a%10;
             result += temp;
             a=a/10;


         }
         if(b<0)return result*(-1);
         else return result;
    }

    public static void main(String[] args) {
        int a = -120;
        System.out.println(ReversInt(a));
    }
}
