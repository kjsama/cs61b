/** Class that prints the Collatz sequence starting from a given number.
 *  @Joey YOUR NAME HERE
 */
public class Collatz {

    /** Buggy implementation of nextNumber! */
    public static int nextNumber(int n) {
        if (n == 1) {
            return 1;
        } else if (n % 2 != 0) {
            /** Check if n is odd */
            return n * 3 + 1;
        } else {
            return n / 2;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        while (n != 1) {
            System.out.print(n + " ");
            n = nextNumber(n);
        }
        System.out.println(n);
    }
}

