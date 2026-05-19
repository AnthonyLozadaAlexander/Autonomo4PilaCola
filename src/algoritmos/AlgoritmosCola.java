package algoritmos;


import tadCola.Cola;
import tadCola.ColaVacia;
import tadPila.PilaVacia;

public class AlgoritmosCola {
	
	public static <T> void encolarPrimero(Cola<T> cola, T dato) {
		try {
			if(cola != null) {
				cola.invertirCola();
				encolarPrimeroR(cola, dato);
			}
			else
				System.err.println("No existe la cola");
		} catch (ColaVacia e) {
			System.err.println(e.getMessage());
		}
		
	}
	
	private static <T> void encolarPrimeroR(Cola<T> cola, T dato) throws ColaVacia {
		if(!cola.colaVacia()) {
			T elem = cola.desencolar();
			encolarPrimeroR(cola, dato);
			cola.encolar(elem);
		}
		else
			cola.encolar(dato);
	}
	
	public static <T> int contar(Cola<T> cola) {
		int resul = contarR(cola);
		cola.invertirCola();
		return resul;
	}
	
	public static <T> int contarR(Cola<T> cola) {
		int resul = -1;
		if(cola != null) {
			if(!cola.colaVacia()) {
				T elemen;
				try {
					elemen = cola.desencolar();
					resul = 1 + contarR(cola);
					cola.encolar(elemen);
				} catch (ColaVacia e) {
					
				}
			}else {
				resul = 0;
			}
		}
		
		return resul;
	}
	
	public static <T> void quitarUltimoR(Cola<T> cola) {
		quitarUltimoR(cola);
		cola.invertirCola();
	}
	
	// se invierte
	public static <T> void quitarUltimo(Cola<T> cola) {
			if(!cola.colaVacia()) {
				try {
				T elem = cola.desencolar();
				if(!cola.colaVacia()) {
					quitarUltimo(cola);
					cola.encolar(elem);
				}
				}catch (ColaVacia e) {
					
				}
			}
		
	}

}
