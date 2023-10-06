//opetators precedence and assiciativity in java by sandeep prasad
// the precedence and associativity rules of Java operators:

//1. Arithmetic Operators:
// Precedence: *, / have higher precedence than +, -.
// Associativity: Left-to-right for +, -.

// 2.Assignment Operators:
// Precedence: *= has higher precedence than +.
// Associativity: Right-to-left for *=.

//3. Comparison Operators:
// Precedence: Comparison operators have higher precedence than logical operators.
// Associativity: Left-to-right for &&, ||.

//4.Logical Operators:
// Precedence: ! has higher precedence than &&, which has higher precedence than ||.
// Associativity: Left-to-right for &&, ||.

//5.Ternary Operator:
// Precedence: Ternary operator ?: has the lowest precedence.
// Associativity: Right-to-left.


public class  $07_2_operators_precence{
    public static void main(String[] args) {
        // Arithmetic Operators
        int result = 5 + 3 * 2 - 4 / 2;
        // Precedence: * and / have higher precedence than + and -
        // Associativity: Left-to-right for + and - (equal precedence)

        System.out.println("Arithmetic Operators: " + result);

        // Assignment Operators
        int x = 10;
        x += 5 * 2;
        // Precedence: *= has higher precedence than +
        // Associativity: Right-to-left for *= (equal precedence)

        System.out.println("Assignment Operators: " + x);

        // Comparison Operators
        boolean isEqual = (10 == 10) && (5 < 10) || (7 != 7);
        // Precedence: Comparison operators have higher precedence than logical operators
        // Associativity: Left-to-right for && and || (equal precedence)

        System.out.println("Comparison Operators: " + isEqual);

        // Logical Operators
        boolean logicalResult = true || false && !true;
        // Precedence: ! has higher precedence than &&, which has higher precedence than ||
        // Associativity: Left-to-right for && and || (equal precedence)

        System.out.println("Logical Operators: " + logicalResult);

        // Ternary Operator
        int num = 15;
        String resultString = (num > 10) ? "Greater than 10" : "Less than or equal to 10";
        // Precedence: Ternary operator ?: has the lowest precedence
        // Associativity: Right-to-left

        System.out.println("Ternary Operator: " + resultString);
    }
}
