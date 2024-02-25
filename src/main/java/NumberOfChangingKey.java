public class NumberOfChangingKey {
    public static int countChanging(String s){
        int count = 0;
        for (int i = 0; i < s.length()-1; i++) {
            String str = s.charAt(i)+"";
            String str1 = s.charAt(i+1)+"";
            if(!(str.equals(str1.toLowerCase())|| str.equals(str1.toUpperCase())))count++;
        }

        return count;
    }

    public static void main(String[] args) {
        String s= "aAbBcC";
        System.out.println(countChanging(s));
    }
}
