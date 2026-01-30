package pruebas;

/**
 * Este algoritmo cuenta con la capacidad de recibir una serie de notas académicas
 * y determinar si el alumno está suspenso o no. También es capaz de decir si la
 * nota más alta del alumno se repite.
 * 
 * @author Bruno
 * @version 1.0
 */

public class Notas {
	
	/**
	 * Punto de inicialización del programa. Se instancia un conjunto de enteros y se llama a los métodos
	 * "repetido", que dice si la nota más alta del conjunto se repite, y "suspenso", que dice si el alumno
	 * está suspenso (media menor a 5), o si está aprobado (media mayor a 5).
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
        int[] notasAlumno = {5, 7, 3, 7, 2, 9, 7}; // Conjunto de notas del alumno.
        repetido(notasAlumno); // Llamada al método "repetido".
        suspenso(notasAlumno); // LLamada al método "suspenso".
    }
	
	/**
	 * Método que recibe un conjunto de notas (números enteros) y dice si la nota más alta del conjunto se repite.
	 * Primero averigua la nota más alta con un bucle y, a la vez, mantiene un contador con las veces que se repite.
	 * Luego, muestra por pantalla el resultado.
	 * 
	 * @param notas Un array de números enteros que simboliza un conjunto de notas académicas.
	 */
	
	public static void repetido( int[] notas ) {
		
		int repetidas = 0; // Valor entero que representa el número de veces que se repite la nota más alta en el conjunto.
        int numMayor = notas[0]; // Valor entero que representa la nota más alta del conjunto.
        
        /**
         * Averiguamos el valor más grande del conjunto mediante un 
         * bucle y llevamos la cuenta de cuántas veces se repite.
         */
        
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > numMayor) {
                numMayor = notas[i];
                repetidas = 0;
            } else if( notas[i] == numMayor ) repetidas++;
        }

        if (repetidas > 0)
        	System.out.println("El mayor valor, " + numMayor + ", está repetido en el conjunto.");
        else
        	System.out.println("El mayor valor, " + numMayor + ", no se repite en el conjunto.");
	}
	
	/**
	 * Método que recibe un conjunto de notas (números enteros) y dice si
	 * el alumno está suspenso (media menor a 5), o si está aprobado (media mayor a 5).
	 * Primero suma todos los valores del conjunto utilizando un bucle y 
	 * divide la suma entre el número de valores. Finalmente, muestra por
	 * pantalla si el alumno está suspendido o aprobado.
	 * 
	 * @param notas Un array de números enteros que simboliza un conjunto de notas académicas.
	 */
	
	public static void suspenso( int[] notas ) {
		
		int suma = 0; // Suma de todos los valores del conjunto.
        
		// Realizamos la suma mediante un bucle.
		
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }

        double media = (double) suma / notas.length; // Media de las notas del alumno.
        System.out.println("\nLa media del alumno es: " + media);

        if (media >= 5)
            System.out.println("El alumno está aprobado.");
        else
            System.out.println("El alumno está suspendido.");
	}
	
}
