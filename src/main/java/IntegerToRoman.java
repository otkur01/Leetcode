public class IntegerToRoman {
    public static String IntegerToRoman(int n){
       int first = n%10;
       n = n/10;
       int second = n%10;
       n = n/10;
       int third = n%10;
       n=n/10;
       int fourth = n%10;
       String result = "";
        while(fourth>0){
            result+="M";
            fourth--;
        }
        while (third>=9){
            result+="CM";
            third -=9;
        }
        while (third>=5){
            result+="D";
            third-=5;
        }
        while (third >= 4) {
            result += "CD";
            third -= 4;
        }
        while (third >= 1) {
            result += "C";
            third -= 1;
        }
        while (second >= 9) {
            result += "XC";
            second -= 9;
        }
        while (second >= 5) {
            result += "L";
            second -= 5;
        }
        while (second >= 4) {
            result += "XL";
            second -= 4;
        }
        while (second >= 1) {
            result += "X";
            second -= 1;
        }
        while (first >= 9) {
           result += "IX";
            first -= 9;
        }
        while (first >= 5) {
            result += "V";
            first -= 5;
        }
        while (first >= 4) {
            result += "IV";
            first -= 4;
        }
        while (first >= 1) {
            result += "I";
            first -= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int a =123;
        System.out.println(IntegerToRoman(a));
    }
    }

