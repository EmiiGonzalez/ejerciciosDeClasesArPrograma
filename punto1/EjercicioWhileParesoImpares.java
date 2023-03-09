package punto1;

import java.util.Scanner;

public class EjercicioWhileParesoImpares {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Ingresar el primero numero: ");
			int numeroInicio = sc.nextInt();
			System.out.println("Ingresar el segundo numero: ");
			int numeroFin = sc.nextInt();
			System.out.println("¿Desea imprimir pares o impares? (p/i)");
			String eleccion = sc.next();
			
			while(numeroInicio <= numeroFin) {
				if(eleccion.equalsIgnoreCase("p")) {	
					if(numeroInicio % 2 == 0) {	
						System.out.println(numeroInicio);
					}
				}
				else if (eleccion.equalsIgnoreCase("i")) {
					if(numeroInicio % 2 == 1) {	
						System.out.println(numeroInicio);
					}
				}
				else {
					System.out.println("Opcion invalida");
					break;
				}
				numeroInicio++;
			}
			sc.close();
	}
}
	

