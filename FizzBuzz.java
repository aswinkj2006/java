import java.util.*;

public class FizzBuzz {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(args[0]);

            if (n < 1 || n > 100)
                throw new IllegalArgumentException("n must be between 1 and 100.");

            List<String> result = new ArrayList<>();

            for (int i = 1; i <= n; i++) {
                if (i % 15 == 0) result.add("FizzBuzz");
                else if (i % 3 == 0) result.add("Fizz");
                else if (i % 5 == 0) result.add("Buzz");
                else result.add(String.valueOf(i));
            }

            System.out.println(result);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
