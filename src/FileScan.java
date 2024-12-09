import java.io.*;
import javax.swing.*;

public class FileScan {

    public static void main(String[] args) {

        if (args.length > 0) {
            String fileName = args[0];
            File file = new File(fileName);
            if (file.exists() && !file.isDirectory()) {

                scanFile(file);
            } else {
                System.out.println("File not found or is a directory.");
            }
        } else {

            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {

                File selectedFile = fileChooser.getSelectedFile();
                scanFile(selectedFile);
            } else {
                System.out.println("No file selected.");
            }
        }
    }

    // Method to scan the file and display the results (lines, words, and characters)
    public static void scanFile(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int lineCount = 0;
            int wordCount = 0;
            int charCount = 0;

            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                lineCount++;
                wordCount += line.split("\\s+").length; // Split by spaces to count words
                charCount += line.length(); // Count characters in the line
            }

            // Display the results
            System.out.println("File: " + file.getName());
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);
        } catch (IOException e) {
            // Handle exceptions if file cannot be read
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
