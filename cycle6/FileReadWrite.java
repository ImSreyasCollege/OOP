import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWrite {

    public static void main(String[] args) {
		System.out.println("Name : Sreyas Satheesh\nRoll.no : 53\nTitle : Write to a file, then read from the file & display the contents on the console\nDate : 08/05/2024\n");

        Scanner scanner = new Scanner(System.in);

        // Get file name from user
        System.out.print("Enter the file name: ");
        String filename = scanner.nextLine();

        // Get content to write from user
        System.out.println("\nEnter the content to write to the file:");
        String contentToWrite = scanner.nextLine();

        // Write to the file
        writeFile(filename, contentToWrite);

        // Read from the file and display the contents
        readFileAndDisplay(filename);

        scanner.close();
    }

    private static void writeFile(String filename, String content) {
        try (FileWriter fileWriter = new FileWriter(filename)) {
            fileWriter.write(content);
            System.out.println("\n** File written successfully. **");
        } catch (IOException e) {
            System.err.println("\n** An error occurred while writing to the file: " + e.getMessage() + " **");
        }
    }

    private static void readFileAndDisplay(String filename) {
        try (FileReader fileReader = new FileReader(filename);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            System.out.println("\nFile contents:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("\n** An error occurred while reading the file: " + e.getMessage() + " **");
        }
    }
}
