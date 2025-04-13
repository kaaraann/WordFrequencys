import java.util.HashMap;
import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Convert to lowercase and split into words
        String[] words = sentence.toLowerCase().split("\\s+");

        // HashMap to store word frequency
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Count frequency
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        // Print word frequencies
        System.out.println("\nWord frequencies:");
        for (String word : wordCount.keySet()) {
            System.out.println(word + " : " + wordCount.get(word));
        }

        scanner.close();
    }
}
