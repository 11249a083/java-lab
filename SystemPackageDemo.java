import java.io.*;
import java.util.*;

public class SystemPackageDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        ArrayList<String> subjects = new ArrayList<>();

        subjects.add("Java");
        subjects.add("DBMS");
        subjects.add("NLP");

        System.out.println("Name: " + name);
        System.out.println("Subjects: " + subjects);

        try {
            File file = new File("student.txt");

            FileWriter fw = new FileWriter(file);

            fw.write("Student Name: " + name);
            fw.write("\nSubjects: " + subjects);

            fw.close();

            System.out.println("Data written to file successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        }

        sc.close();
    }
}
