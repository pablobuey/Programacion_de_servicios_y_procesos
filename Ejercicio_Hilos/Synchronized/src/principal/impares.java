package principal;

public class impares extends Thread {

	public void run() {
		int n, c = 0;
		int contador = 0;
		for (n = 1; n <= 10; n++) {
			c = n % 2;
			if (c != 0) {
				contador = contador + n;
				System.out.println(" " + n);
			}
		}
		System.out.print("Suma impares: " + contador + "\n");
	}

}
