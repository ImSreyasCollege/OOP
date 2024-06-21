import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {

    public static void main(String[] args) {
        System.out.println(
                "Name : Sreyas Satheesh\nRoll.no : 53\nTitle : Program to copy one file to another\nDate : 08/05/2024\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the source file name: ");
        String sourceFileName = scanner.nextLine();

        System.out.print("Enter the destination file name: ");
        String destinationFileName = scanner.nextLine();

        copyFile(sourceFileName, destinationFileName);

        scanner.close();
    }

    private static void copyFile(String sourceFileName, String destinationFileName) {
        try (FileReader fileReader = new FileReader(sourceFileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(destinationFileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            System.out.println("\n** File copied successfully **");
        } catch (IOException e) {
            System.err.println("\n** An error occurred while copying the file: " + e.getMessage() + " **");
        }
    }
}
