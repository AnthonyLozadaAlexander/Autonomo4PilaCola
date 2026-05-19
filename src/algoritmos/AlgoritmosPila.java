package algoritmos;

import tadPila.Pila;
import tadPila.PilaVacia;

public class AlgoritmosPila {
	public static <T> void sumergir(Pila<T> pila, T dato) {		
		if(!pila.pilaVacia()) {
			T elem;
			try {
				elem = pila.desapilar();
				sumergir(pila, dato);
				pila.apilar(elem);
			} catch (PilaVacia e) {
				
			}			
		}
		else {
			pila.apilar(dato);
		}
	}
	
	
	public static <T> int contar(Pila<T> pila) {
		int resul = -1;
		if (pila != null) { // si lo que ingresamos a la pila no es null
			if (!pila.pilaVacia()) {
				T elemen;
				try {
					elemen = pila.desapilar();
					resul = 1 + contar(pila);
					pila.apilar(elemen);
				} catch (PilaVacia e) {

				}
			} else {
				resul = 0;
			}
		}
		return resul;

	}
	
	public static <T> int pilaNull(Pila<T> pila) {
		int res = 0;
		if(pila == null) { 
			res = -1;
		}
		
		return res;	
		
	}
	
	public static <T> void invertirPila(Pila<T> pila) {
		if (pila != null) {
			if (!pila.pilaVacia()) {
				try {
					T elemen = pila.desapilar();
					invertirPila(pila);
					sumergir(pila, elemen);
				} catch (PilaVacia e) {

				}
			}
		}
	}
	
}
