import mathops.Calculator;

class CalculatorTest {
 public static void main(String[] args) {
 mathops.Calculator c = new mathops.Calculator();
 System.out.println("Sum (int): " + c.add(5, 10));
 System.out.println("Sum (double): " + c.add(5.5, 10.5));
 System.out.println("Sum (three ints): " + c.add(5, 10, 15));
 }
}
