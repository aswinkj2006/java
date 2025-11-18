import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        File source = new File("input.txt");
        File dest = new File("output.txt");

        try {
            // Create sample file if missing
            if (!source.exists()) {
                FileWriter fw = new FileWriter(source);
                fw.write("Sample text inside input.txt");
                fw.close();
            }

            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(dest);

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            fis.close();
            fos.close();

            System.out.println("File copied successfully!");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}
