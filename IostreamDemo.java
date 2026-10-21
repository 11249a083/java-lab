import java.io.*;
public class IostreamDemo{
    public static void main(String[] args) throws IOException {
       FileOutputStream fos = new FileOutputStream("sample.txt");
       String data = "Welcome to java I/O stream.\n";
       data = data + "This is a written using Fileoutput stream.";
       fos.write(data.getBytes());
       fos.close();
       System.out.println("Data written to file successfully.");
       FileInputStream fis = new FileInputStream("sample.txt");
       System.out.println("\nFile contents:");
       int ch;
       while((ch = fis.read()) != -1){
           System.out.print((char)ch);
       }
       fis.close();
    }
}