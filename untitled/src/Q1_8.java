public class Q1_8 {
    public static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String testString = "Hello, World!";
        int vowelCount = countVowels(testString);
        System.out.println("Number of vowels: " + vowelCount);
    }

}

