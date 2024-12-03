public class Q1_9 {

    public static String removePunctuation(String s) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c) || Character.isWhitespace(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
        String input = "Let's try, Mike!";
        String output = removePunctuation(input);
        System.out.println(output);
    }}

