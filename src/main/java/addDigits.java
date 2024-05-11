public class addDigits {

    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
    public static int sum(int num){
        int sum = 0;
        while (num!=0){
            int digit = num%10;
            sum+=digit;
            num=num/10;
        }
     return sum;
    }
    public static int addDigits(int num) {
        while (num>=10){
          num=sum(num);

        }

        return num;
    }
}
