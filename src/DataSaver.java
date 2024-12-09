import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DataSaver {
    public static void main(String[] args) {

        ArrayList<String> records = new ArrayList<>();


        while (true) {

            String firstName = SafeInput.getNonZeroLenString("Enter First Name: ");
            String lastName = SafeInput.getNonZeroLenString("Enter Last Name: ");
            String idNumber = String.format("%06d", SafeInput.getInt("Enter ID Number (6 digits): "));
            String email = SafeInput.getNonZeroLenString("Enter Email: ");
            int yearOfBirth = SafeInput.getInt("Enter Year of Birth (4 digits): ");


            String record = String.format("%s, %s, %s, %s, %d", firstName, lastName, idNumber, email, yearOfBirth);
            records.add(record);


            boolean addAnother = SafeInput.getYNConfirm("Do you want to enter another record?");
            if (!addAnother) {
                break;
            }
        }


        String filename = SafeInput.getNonZeroLenString("Enter the filename (with .csv extension): ");


        try (FileWriter writer = new FileWriter(new File("src/" + filename))) {
            for (String recordEntry : records) {
                writer.write(recordEntry + "\n");  // Write each record on a new line
            }
            System.out.println("Data saved to " + filename);
        } catch (IOException e) {
            System.out.println("Error saving the file: " + e.getMessage());
        }
    }
}
