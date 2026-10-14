import java.util.*;
import java.io.*;

public class SystemPackageDemo1 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        ArrayList<String> subject = new ArrayList<String>();

        subject.add("java");
        subject.add("dbms");
        subject.add("nlp");

        System.out.println("Name: " + name);
        System.out.println("Subjects: " + subject);

        File file = new File("student.txt");

        FileWriter fw = new FileWriter(file);

        fw.write("Student Name: " + name);
        fw.close();

        System.out.println("Data written to file successfully.");

        sc.close();
    }
}