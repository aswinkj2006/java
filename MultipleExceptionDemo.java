import java.io.*;

class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
 super(message);
 }
}

public class MultipleExceptionDemo {
 public static void main(String[] args) {
 try {

// 1. ArithmeticException
 int a = 10, b = 0;
 int result = a / b;
 System.out.println("Result: " + result);
 
// 2. ArrayIndexOutOfBoundsException
 int[] numbers = {1, 2, 3};
 System.out.println("Accessing 5th element: " + numbers[4]);
 
// 3. FileNotFoundException
 FileReader fr = new FileReader("nonexistentfile.txt");
 BufferedReader br = new BufferedReader(fr);
 System.out.println(br.readLine());
 br.close();

 // 4. User-defined Exception
 int age = 15;
 if (age < 18)
 throw new InvalidAgeException("Age below 18 is not eligible for voting");
 }
 catch (ArithmeticException e) {
 System.out.println("Error: Division by zero is not allowed.");
 }
 catch (ArrayIndexOutOfBoundsException e) {
 System.out.println("Error: Array index out of range.");
 }
 catch (FileNotFoundException e) {
 System.out.println("Error: File not found.");
 }
 catch (InvalidAgeException e) {
 System.out.println("Custom Exception: " + e.getMessage());
 }
 catch (Exception e) {
 System.out.println("General Exception: " + e.getMessage());
 }
 finally {
 System.out.println("Program execution completed and resources are released safely.");
 }
 }
}
