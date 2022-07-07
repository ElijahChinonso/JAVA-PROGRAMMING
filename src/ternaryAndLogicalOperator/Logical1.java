package ternaryAndLogicalOperator;

public class Logical1 {
    public static void main(String[] args) {
        // truth table for && (conditinal AND) operator
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%s, Conditional AND (&&), false && false," +
                "(false && false), false && true, (false && true), true && false, (true && false), true && true", (true && true));

        // truth table for || (conditinal OR) operator
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%s, Conditional OR (||), false || false," +
                "(false || false), false || true, (false || true), true || false, (true || false), true || true", (true || true));

        // truth table for & (boolean logical AND) operator
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%s, Boolean logical AND (&), false & false," +
                "(false & false), false & true, (false & true), true & false, (true & false), true & true", (true & true));

        // truth table for | (boolean logical inclusive OR) operator
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%s, Boolean logical inclusive OR (|), false | false," +
                "(false | false), false &| true, (false | true), true | false, (true | false), true | true", (true | true));

        // truth table for ^ (boolean logical exclusive OR) operator
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%s, Boolean logical exclusive OR (^), false ^ false," +
                "(false ^ false), false ^ true, (false ^ true), true ^ false, (true ^ false), true ^ true", (true ^ true));

        // truth table for ! (logical negation) operator
        System.out.printf("%s%n%s: %b%n%s: %b%n%s", "Logical NOT (!)", "!false", (!false), "!true", (!true));
    }
}
