package textChunker;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TextChunker textChunkerReader = new TextChunker();
        System.out.print("Enter a text to process: ");
        String message = scanner.nextLine();
        System.out.println(message);

        System.out.print("Enter Length: ");
        int N = scanner.nextInt();
        System.out.println(N);

        TextChunker txtChuncker = new TextChunker(message, N);

        List<String> chunks = txtChuncker.chunkMessage(message, N);

        if (chunks.isEmpty()) {
            System.out.println("One or more words exceed the allowed length.");
        } else {
            for (String chunk : chunks) {
                System.out.println(chunk);
            }
        }
    }
}
