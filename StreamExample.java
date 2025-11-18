import java.io.*;
public class StreamExample {
 public static void main(String[] args) {
 try {
 // Writing data to a file using FileOutputStream
 FileOutputStream f1 = new FileOutputStream("output.txt");
 String data = "Hi My Name is Megha How are you whats up buddy im eating momos";
 f1.write(data.getBytes());
 f1.close();
 System.out.println("Data written to file successfully.");
 // Reading data from a file using FileInputStream
 FileInputStream fis = new FileInputStream("output.txt");
 int i;
 System.out.print("Data read from file: ");
 while ((i = fis.read()) != -1) {
 System.out.print((char) i);
 }
 fis.close();
 } catch (IOException e) {
 System.out.println("I/O Error: " + e.getMessage());
 }
 }
}
