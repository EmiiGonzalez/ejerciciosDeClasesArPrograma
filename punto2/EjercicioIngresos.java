package punto2;

import java.util.Scanner;

public class EjercicioIngresos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		boolean inmueble = comprobar("¿Posee 3 o mas inmuebles? s/n: ");
		boolean vehiculos = comprobar("¿Posee 3 o mas vehiculos con antiguedad menor a 5 años? s/n: ");
		boolean poseciones = comprobar("¿Posee una embarcacion, aeronave de lujo o es titular de activos societarios que\n demuestren capacidad económica plena? s/n: ");
		boolean ingresos = ingresosDelHogar("Ingrese el total de ingresos mensuales del hogar: ");
		boolean ingresoAlto = (inmueble || vehiculos || poseciones || ingresos);
		
		
		if(ingresoAlto) {
			System.out.println("El usuario registrado pertenece a la categoria de ingresos altos");
		}
		else {
			System.out.println("El usuario registrado no pertenece a la categoria de ingresos altos");
		}
		
	
		sc.close();
	}
	
	public static boolean ingresosDelHogar(String palabra) {
		Scanner sc = new Scanner(System.in);
		boolean valorValido = false;
		System.out.println(palabra);
		double ingreso = 0.0;
		
		while(!valorValido) {
			if(sc.hasNextDouble()){
				ingreso = sc.nextDouble();
				valorValido = true;
			} else {
				System.out.println("Error: Solo se deben ingresar valores numericos.");
				System.out.println(palabra);
				sc.next();
			}
		}
		
		return ingreso >= 489.083;
	}
	
	public static boolean comprobar(String pregunta) {
		
	    Scanner sc = new Scanner(System.in);
	    boolean aux = true;
	    boolean comprobar = true;
	    
	    while(aux) {
	        System.out.println(pregunta);
	        String control = sc.next();
	        if(control.equalsIgnoreCase("s")) {
	            aux = false;
	        } else if(control.equalsIgnoreCase("n")) {
	            aux = false;
	            comprobar = false;
	        } else {
	            System.out.println("Valor ingresado invalido, intente nuevamente. ");
	        }
	    }
	    return comprobar;
	}
	
	
}

