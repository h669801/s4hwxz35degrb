package oppgD;

public class IkkeRekursivFibonacci {
	public static int beregn(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int f1 = 0;
            int f2 = 1;
            int fn = 0;
            for (int i = 2; i <= n; i++) {
                fn = f1 + f2;
                f1 = f2;
                f2 = fn;
            }
            return fn;
        }
    }
}
