package punto1;

import java.util.Scanner;

public class ejercicioForParesOImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresar el primero numero: ");
        int numeroInicio = sc.nextInt();
        System.out.println("Ingresar el segundo numero: ");
        int numeroFin = sc.nextInt();
        
        System.out.println("Los numeros impares entre " + numeroInicio + " " + numeroFin + " son:" );
        for(int i = numeroInicio; i <= numeroFin; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }

        sc.close();
}
}
