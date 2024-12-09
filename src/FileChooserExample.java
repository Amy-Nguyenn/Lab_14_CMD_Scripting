import javax.swing.JFileChooser;
import java.io.File;

public class FileChooserExample {
    public static void main(String[] args) {

        JFileChooser fileChooser = new JFileChooser();


        fileChooser.setCurrentDirectory(new File("src"));


        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("You selected: " + selectedFile.getAbsolutePath());
        } else {
            System.out.println("No file was selected.");
        }
    }
}
