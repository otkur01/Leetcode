public class ReverseInteger {
    public static int reverse(int a){
        if(a<=-2147483648 || a >=2147483647)return 0;
        else {
            int c = a;
            if (a < 0) a = Math.abs(a);
            String num = String.valueOf(a);
            String temp = "";
            for (int length = num.length() - 1; length >= 0; length--) {
                temp += num.charAt(length);
            }
            if(Long.parseLong(temp)>Integer.MAX_VALUE) return 0 ;
            if(c<0 && Long.parseLong(temp)*(-1)<Integer.MIN_VALUE)return 0;
            if (c < 0) return (int) Long.parseLong(temp) * (-1);
            return (int) Integer.valueOf(temp);
        }
    }

    public static void main(String[] args) throws Exception {
        int a = -2147483648;
        System.out.println(reverse(a));
    }
}
