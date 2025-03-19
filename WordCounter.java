import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        String sentence = getSentenceInput();
        int wordCount = countWords(sentence);
        System.out.println("The sentence has " + wordCount + " words.");
    }

    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().trim();
        return sentence;
    }

    public static int countWords(String sentence) {
        if (sentence.isEmpty()) {
            return 0; // Return 0 if the input is empty
        }
        String[] words = sentence.split("\\s+"); // Splits by one or more spaces
        return words.length;
    }
}