class OperatorExample {
    public static void main(String[] args) {
        int a = 10, b = 20;

        // 1. Unary Operator
        System.out.println("Unary: ++a = " + (++a));  // pre-increment

        // 2. Arithmetic Operator
        System.out.println("Arithmetic: a + b = " + (a + b));

        // 3. Bitwise Operator
        System.out.println("Bitwise: a & b = " + (a & b));

        // 4. Logical Operator
        System.out.println("Logical: (a < b) && (b > 5) = " + ((a < b) && (b > 5)));

        // 5. Relational Operator
        System.out.println("Relational: a > b = " + (a > b));

        // 6. Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("Ternary: Max = " + max);

        // 7. Assignment Operator
        int x = 5;
        x += 3;  // x = x + 3
        System.out.println("Assignment: x += 3 -> x = " + x);
    }
}
