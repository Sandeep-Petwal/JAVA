//javá operators by sandeep prasad
public class $07_1_opetators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // 1. Arithmetic Operators
        int sum = a + b; // Addition
        int difference = a - b; // Subtraction
        int product = a * b; // Multiplication
        int quotient = a / b; // Division
        int remainder = a % b; // Modulus

        // 2. Assignment Operators
        int c = a; // Simple Assignment
        c -= a; // Subtraction Assignment
        c *= a; // Multiplication Assignment
        c %= a; // Modulus Assignment
        c /= a; // Division Assignment
        c += a; // Addition Assignment

        // 3. Comparison Operators
        boolean isEqual = (a == b); // Equal to
        boolean isNotEqual = (a != b); // Not equal to
        boolean isGreater = (a > b); // Greater than
        boolean isLess = (a < b); // Less than
        boolean isGreaterOrEqual = (a >= b); // Greater than or equal to
        boolean isLessOrEqual = (a <= b); // Less than or equal to

        // 4. Logical Operators
        boolean logicalAnd = (a > 0 && b > 0); // Logical AND
        boolean logicalOr = (a > 0 || b > 0); // Logical OR
        boolean logicalNot = !(a > 0); // Logical NOT

        // 5. Conditional (Ternary) Operator
        int max = (a > b) ? a : b; // Assigns the maximum value of a and b to max

        // Printing the results
        System.out.println("Arithmetic Operators:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        System.out.println("\nAssignment Operators:");
        System.out.println("c: " + c);

        System.out.println("\nComparison Operators:");
        System.out.println("isEqual: " + isEqual);
        System.out.println("isNotEqual: " + isNotEqual);
        System.out.println("isGreater: " + isGreater);
        System.out.println("isLess: " + isLess);
        System.out.println("isGreaterOrEqual: " + isGreaterOrEqual);
        System.out.println("isLessOrEqual: " + isLessOrEqual);

        System.out.println("\nLogical Operators:");
        System.out.println("logicalAnd: " + logicalAnd);
        System.out.println("logicalOr: " + logicalOr);
        System.out.println("logicalNot: " + logicalNot);

        System.out.println("\nConditional (Ternary) Operator:");
        System.out.println("Max value: " + max);
    }
}
