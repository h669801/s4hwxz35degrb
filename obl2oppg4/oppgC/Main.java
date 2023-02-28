package oppgC;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Fibonacci-tallene:");
        for (int n = 0; n <= 10; n++) {
            int fib = Fibonacci.beregn(n);
            System.out.println("f" + n + " = " + fib);
        }
	}
}
