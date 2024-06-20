public class reversWords {
    public static void main(String[] args) {
        String s ="a good   example";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
            // Trim the input string to remove leading and trailing spaces
            s = s.trim();
            // Split the string into words by one or more spaces
            String[] words = s.split("\\s+");
            // Reverse the array of words
            int left = 0, right = words.length - 1;
            while (left < right) {
                String temp = words[left];
                words[left] = words[right];
                words[right] = temp;
                left++;
                right--;
            }
            // Join the words with a single space separating them
            return String.join(" ", words);
        }
    }

