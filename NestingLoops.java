public class NestingLoops {
    public static void main(String[] args) {

        // for (char c = 'A'; c <= 'E'; c++) {
        // for (int n = 1; n <= 3; n++) {
        // System.out.println(c + " " + n);
        // }
        // }
        for (int n = 1; n <= 3; n++) {
            for (char c = 'A'; c <= 'E'; c++) {

                System.out.println(c + " " + n);
            }
        }

        // inner loop runs faster
        // when reversed ABCDE 11111

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                System.out.println(a + "-" + b + " ");
            }
            // prints each iteration on new line

            System.out.println();
            // prints a blank space at the end of the loop
        }

        System.out.println("\n");

    }
}

// Assignments turned in without these things will receive no credit.

// Look at the first set of nested loops ("CN"). Which variable changes faster?
// Is it the variable controlled by the outer loop (c) or the variable
// controlled by the inner loop (n)? Answer in a comment.

// Change the order of the loops so that the "c" loop is on the inside and the
// "n" loop is on the outside. How does the output change?

// Look at the second set of nested loops ("AB"). Change the print() statement
// to println(). How does the output change? (Then change it back to print().)

// Add a System.out.println() statement after the close brace of the inner loop
// (the "b" loop), but still inside the outer loop. How does the output change?