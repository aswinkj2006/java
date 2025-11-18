public class CommandLineMessage {
 public static void main(String[] args) {
 if (args.length > 0)
 System.out.println("Message: " + String.join(" ", args));
 else
 System.out.println("No arguments provided. Example: CSE SNSCT");
 }
}