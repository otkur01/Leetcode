public class LenthOFLastWord {
    public static void main(String[] args) {

    }

    public static int LenngOfLast(String str){
        String[] strings = str.split(" ");
        return strings[strings.length-1].length();


    }
}
