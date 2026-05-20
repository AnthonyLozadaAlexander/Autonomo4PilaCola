package logicaRecursividad;

import tadCola.*;

public class RecursividadCola {
	
	public static <T> T ultimoElemento(Cola<T> cola) throws ColaVacia {
		
		Cola<T> aux;
		aux = cola;
		
		if(aux.colaVacia()) {
			return null;
		}
		
		/*
		 *   Sacamos los primeros elementos de la cola
		 */
		
		T guardar = aux.desencolar(); 
		
		T resultRecursivo = ultimoElemento(cola); // mandamos a desencolar el resto de la cola 
		
		cola.encolar(guardar);
		
		if(resultRecursivo == null) {
			
			return guardar;  // si el resultado de la recursividad es null, quiere decir que el ultimo elemento desencolado fue el ultimo en guardar
		}else {
			return resultRecursivo;
		}
		
		
		
		
		
	}
	
}
