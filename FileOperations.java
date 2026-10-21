
import java.io.*;
import java.util.*;

public class FileOperations {
    public static void main(String[] args) throws IOException {

        // Create a file
        File file = new File("sample.txt");

        // Write data into file
        FileWriter fw = new FileWriter(file);

        fw.write("Welcome to java file operations.\n");
        fw.write("This is a sample text file.");

        fw.close();

        System.out.println("Data written successfully.");

        // Read data from file
        Scanner sc = new Scanner(file);

        System.out.println("\nFile contents:");

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }

        sc.close();
    }
}
