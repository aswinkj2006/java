import java.io.*;

public class St{
public static void main(String[] args){

FileInputStream fi = new FileInputStream("output.txt");
FileOutputStream fo = new FileOutputStream("input.txt");
int i;
while((i = fi.read()) != -1){
String s = (char) i;
fi.write(s.getBytes());
}

fi.close();
fo.close();
}
}