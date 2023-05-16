
import java.io.BufferedReader;
        import java.io.FileReader;
        import java.io.IOException;

public class file_read_operations_29 {
    public static void main(String[] args) throws IOException {
        String fileName = "example.txt";
        FileReader fileReader = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(fileReader);

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        String line;
        while ((line = reader.readLine()) != null) {
            charCount += line.length();
            String[] words = line.split("\\s+");
            wordCount += words.length;
            lineCount++;
        }

        System.out.println("Number of characters: " + charCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of lines: " + lineCount);

        reader.close();
        fileReader.close();
    }
}
