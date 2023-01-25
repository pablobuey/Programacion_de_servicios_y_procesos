package principal;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion = 0;
		while (opcion != 5) {

			System.out.println("Elije una opcion: ");
			System.out.println("1-Abrir Open Office.");
			System.out.println("2-Abrir Paint.");
			System.out.println("3-Abrir bloc de notas.");
			System.out.println("4-Ejecutar comando cmd.");
			System.out.println("5-Salir");

			Scanner sc = new Scanner(System.in);
			opcion = sc.nextInt();

			switch (opcion) {

			case 1:

				String ruta = "C:\\Program Files (x86)\\OpenOffice 4\\program\\swriter.exe";
				LanzadorProcesos lp = new LanzadorProcesos();
				lp.ejecutar(ruta);
				System.out.println("Finalizado");

				break;

			case 2:
				ruta = "C:\\WINDOWS\\system32\\mspaint.exe";
				lp = new LanzadorProcesos();
				lp.ejecutar(ruta);
				System.out.println("Finalizado");
				break;

			case 3:
				ruta = "C:\\WINDOWS\\system32\\notepad.exe";
				lp = new LanzadorProcesos();
				lp.ejecutar(ruta);
				System.out.println("Finalizado");

				break;

			case 4:

				try {
					// Se lanza el ejecutable.
					Process p = Runtime.getRuntime().exec("cmd /c dir");

					// Se obtiene el stream de salida del programa
					InputStream is = p.getInputStream();

					/* Se prepara un bufferedReader para poder leer la salida más comodamente. */
					BufferedReader br = new BufferedReader(new InputStreamReader(is));

					// Se lee la primera linea
					String aux = br.readLine();

					// Mientras se haya leido alguna linea
					while (aux != null) {
						// Se escribe la linea en pantalla
						System.out.println(aux);

						// y se lee la siguiente.
						aux = br.readLine();
					}
				} catch (Exception e) {
					// Excepciones si hay algún problema al arrancar el ejecutable o al leer su
					// salida.*/
					e.printStackTrace();
				}

				break;

			case 5:
				System.out.println("Adios");
				break;

			}

		}

		String ruta = "C:\\Program Files (x86)\\OpenOffice 4\\program\\swriter.exe";
		LanzadorProcesos lp = new LanzadorProcesos();
		lp.ejecutar(ruta);
		System.out.println("Finalizado");

	}

}
