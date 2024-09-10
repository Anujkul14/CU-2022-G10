package Lec38;

import java.util.Scanner;

public class numberOfValidWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String userInput = sc.nextLine();

        System.out.println("Number of valid words: " + countValidWords(userInput));
    }
    private static boolean isValid(String token) {
        // if (token.isEmpty()) {
        //     return false;
        // }

        int hyphenCount = 0;
        int punctuationCount = 0;

        for (int i = 0; i < token.length(); i++) {
            char c = token.charAt(i);

            // Check for digits using ASCII values
            if (c >= '0' && c <= '9') {
                return false;
            }

            // Hyphen rules
            if (c == '-') {
                hyphenCount++;
                if (hyphenCount > 1 || i == 0 || i == token.length() - 1 ||
                        (token.charAt(i - 1) < 'a' || token.charAt(i - 1) > 'z') ||
                        (token.charAt(i + 1) < 'a' || token.charAt(i + 1) > 'z')) {
                    return false;
                }
            }

            // Punctuation rules
            if (c == '!' || c == '.' || c == ',') {
                punctuationCount++;
                if (punctuationCount > 1 || i != token.length() - 1) {
                    return false;
                }
            }
        }

        return true;
    }
    public static int countValidWords(String sentence) {
        String[] tokens = sentence.split("\s+");
        int validCount = 0;

        for (String token : tokens) {
            if (isValid(token)) {
                validCount++;
            }
        }

        return validCount;
    }
}
