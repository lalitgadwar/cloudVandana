package cloudVandana;

public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; // Change this to your desired input
        boolean isPangram = checkPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean checkPangram(String str) {
        // Create a boolean array to mark the presence of each alphabet
        boolean[] mark = new boolean[26];
        int index;

        // Traverse the input string and mark the presence of each alphabet
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if ('A' <= c && c <= 'Z') {
                index = c - 'A';
            } else if ('a' <= c && c <= 'z') {
                index = c - 'a';
            } else {
                // Skip characters that are not alphabets
                continue;
            }

            mark[index] = true;
        }

        // Check if any alphabet is missing
        for (int i = 0; i < 26; i++) {
            if (!mark[i]) {
                return false;
            }
        }

        return true;
    }
}

