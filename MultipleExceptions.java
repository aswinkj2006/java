import java.io.*;

class InvalidAgeException extends Exception{
public InvalidAgeException(String message){
super(message);
}
}

public class MultipleExceptions{
public static void main(String args[]){
try{
int a=10;
int b=0;
int c=a/b;
System.out.println("Result" + c);
}catch(ArithmeticException e){
System.out.println("division by zero is not allowed");
}

try{
int arr[]={1,2,3};
System.out.println("Accessing 4th element"+ arr[4]);
}catch(ArrayIndexOutOfBoundsException e){
System.out.println("Array index out of box");
}

try{
FileReader fr=new FileReader("nonexistingfile.txt");
BufferedReader br=new BufferedReader(fr);
System.out.println(br.readLine());
br.close();}catch(FileNotFoundException e){
System.out.println("Error: File not found.");
}catch (IOException e) {
 System.out.println("Error: IO Exception occurred.");
}

try{
int age=15;
if(age<18){
throw new InvalidAgeException("Age below 18 is not eligible for voting");
}
}catch(InvalidAgeException e){
System.out.println("Custom exception:"+e.getMessage());
}

System.out.println("Program execution completed and resources are released safely");
 }
}