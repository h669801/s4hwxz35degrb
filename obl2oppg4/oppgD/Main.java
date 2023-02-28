package oppgD;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//asdfasdff
		System.out.println("Fibonacci tallene:");
        for (int n = 0; n <= 10; n++) {
            int fib = IkkeRekursivFibonacci.beregn(n);
            System.out.println("f" + n + " = " + fib);
        }
    }

}
