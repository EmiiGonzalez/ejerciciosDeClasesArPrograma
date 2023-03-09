package punto1;

public class EjercicioWhilePares {
	public static void main(String[] args) {
		int numeroInicio = 0;
		int numeroFin = 20;
		
		while(numeroInicio <= numeroFin) {
			
			if(numeroInicio % 2 == 0) {	
				System.out.println(numeroInicio);
			}
			
			numeroInicio++;
		}
	}
}
