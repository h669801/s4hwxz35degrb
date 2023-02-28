package oppgB;

public class Tallfølgen {
	public static int beregn(int n) {
        if (n == 0) {
            return 2;
        } else if (n == 1) {
            return 5;
        } else {
            return 5 * beregn(n - 1) - 6 * beregn(n - 2) + 2;
        }
    }
}
