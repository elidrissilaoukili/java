package textChunker;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class TextChunker {

    private String message;
    private int N;

    public TextChunker() {
    }

    public TextChunker(String message, int N) {
        this.message = message;
        this.N = N;
    }


    public List<String> chunkMessage(String message, int N) {
        // Check if any word exceeds the allowed length N
        for (String word : message.split(" ")) {
            if (word.length() > N) {
                return new ArrayList<>(); // Return empty list if any word exceeds N
            }
        }

        // Split the message into words
        List<String> words = new ArrayList<>(Arrays.asList(message.split(" ")));
        int length = words.size();
        List<String> chunks = new ArrayList<>();

        // Calculate total chunks based on character length limit (N - 7 for the suffix)
        int totalChunks = (int) Math.ceil((double) message.length() / (N - 7));

        // Split the message into chunks
        int chunkIndex = 0;
        while (chunkIndex < length) {
            int endIndex = Math.min(chunkIndex + (N - 7), length);
            StringBuilder chunk = new StringBuilder();

            // Add words to the current chunk
            for (int i = chunkIndex; i < endIndex; i++) {
                chunk.append(words.get(i)).append(" ");
            }

            // Remove trailing space and append the suffix (x/y)
            chunk.deleteCharAt(chunk.length() - 1);
            chunk.append(" (").append(chunks.size() + 1).append("/").append(totalChunks).append(")");

            // Add the chunk to the list of chunks
            chunks.add(chunk.toString());

            // Move to the next chunk
            chunkIndex = endIndex;
        }

        return chunks;
    }

}
