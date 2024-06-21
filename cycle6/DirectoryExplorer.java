import java.io.File;
import java.util.Scanner;

public class DirectoryExplorer {

    public static void main(String[] args) {
		System.out.println("Name : Sreyas Satheesh\nRoll.no : 53\nTitle : List the sub directories and files in each directory & search for a file name\nDate : 08/05/2024\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter directory path: ");
        String directoryPath = scanner.nextLine();
        System.out.println("");

        exploreDirectory(directoryPath);

        scanner.close();
    }

    private static void exploreDirectory(String directoryPath) {
        File directory = new File(directoryPath);

        if (!directory.isDirectory()) {
            System.out.println(directoryPath + " is not a directory");
            return;
        }

        exploreDirectory(directory, ""); 

        searchFile(directory);
    }

    private static void exploreDirectory(File directory, String indent) {
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                System.out.println(indent + (file.isDirectory() ? "[" + file.getName() + "]" : file.getName()));

                if (file.isDirectory()) {
                    exploreDirectory(file, indent + "  "); 
                }
            }
        }
    }

    private static void searchFile(File directory) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter the filename to search: ");
        String filename = scanner.nextLine();

        boolean found = searchFileInDirectory(directory, filename);

        if (!found) {
            System.out.println("File not found in the directory or its subdirectories.");
        }

        scanner.close();
    }

    private static boolean searchFileInDirectory(File directory, String filename) {
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.getName().equals(filename)) {
                    System.out.println("** Found file: " + file.getAbsolutePath() + " **");
                    return true;
                }

                if (file.isDirectory()) {
                    boolean foundInSubDir = searchFileInDirectory(file, filename); 
                    if (foundInSubDir) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
