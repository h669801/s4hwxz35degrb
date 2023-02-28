package oppgA;

public class Sum {
	public static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return sum(n - 1) + n;
        }
    }
}
