import java.util.Scanner;

public class SafeInput {


    public static String getNonZeroLenString(String prompt) {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.print(prompt);
            input = scanner.nextLine();
            if (input.length() > 0) {
                return input;
            } else {
                System.out.println("Input cannot be empty. Please try again.");
            }
        }
    }


    public static int getInt(String prompt) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            }
        }
    }


    public static double getDouble(String prompt) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }
    }


    public static boolean getYNConfirm(String prompt) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(prompt + " (Y/N): ");
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("y") || input.equals("yes")) {
                return true;
            } else if (input.equals("n") || input.equals("no")) {
                return false;
            } else {
                System.out.println("Please enter 'Y' for Yes or 'N' for No.");
            }
        }
    }
}
