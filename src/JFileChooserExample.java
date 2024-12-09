import javax.swing.*;
import java.io.*;

public class JFileChooserExample {

    public static void main(String[] args) {
        // Create an instance of JFileChooser
        JFileChooser fileChooser = new JFileChooser();

        // Set the dialog title
        fileChooser.setDialogTitle("Select a File");

        // Show the file chooser dialog and capture the user's selection
        int returnValue = fileChooser.showOpenDialog(null);

        // Check if the user approved the selection
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            // Get the selected file
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("File selected: " + selectedFile.getAbsolutePath());

            // You can perform actions with the file here, such as passing it to other methods
            // For example, you could pass the selected file to your FileScan class for processing
        } else {
            // If no file was selected
            System.out.println("No file selected.");
        }
    }
}
