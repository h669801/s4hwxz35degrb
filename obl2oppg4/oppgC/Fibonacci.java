package oppgC;

public class Fibonacci {
	public static int beregn(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return beregn(n - 1) + beregn(n - 2);
        }
    }
}
