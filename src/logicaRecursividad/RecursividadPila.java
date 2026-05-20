package logicaRecursividad;

import tadPila.Pila;
import tadPila.PilaVacia;

public class RecursividadPila {

	public static <T> T buscarFondo(Pila<T> pila) {
		T resultado = null;

		if (!pila.pilaVacia()) {
			T elem;
			try {
				elem = pila.desapilar();
				resultado = buscarFondo(pila);
				pila.apilar(elem);
				if (resultado == null) {
					resultado = elem;
				}
			} catch (PilaVacia e) {
			}
		} else {
			resultado = null;
		}
		return resultado;
	}

	
	public static <T> boolean buscarBoolean(Pila<T> pila, T objetivo) {
		boolean resultado = false;
		if (!pila.pilaVacia()) {
			T elem;
			try {
				elem = pila.desapilar();
				if (elem.equals(objetivo)) {
					resultado = true;
				} else {
					resultado = buscarBoolean(pila, objetivo);
				}
				pila.apilar(elem);
			} catch (PilaVacia e) {
			}
		} else {
			resultado = false;
		}
		return resultado;
	}
	
	
	public static <T extends Comparable<T>> T buscarMayor(Pila<T> pila) {
		T resultado = null;

		if (!pila.pilaVacia()) {
			T elem;
			try {
				elem = pila.desapilar();
				resultado = buscarMayor(pila);
				pila.apilar(elem);

				if (resultado == null) {
					resultado = elem;
				} else if (elem.compareTo(resultado) > 0) {
					resultado = elem;
				}
			} catch (PilaVacia e) {
			}
		} else {
			resultado = null;
		}
		return resultado;
	}

	
	public static <T extends Comparable<T>> T buscarMenor(Pila<T> pila) {
		T resultado = null;

		if (!pila.pilaVacia()) {
			T elem;
			try {
				elem = pila.desapilar();
				resultado = buscarMenor(pila);
				pila.apilar(elem);

				if (resultado == null) {
					resultado = elem;
				} else if (elem.compareTo(resultado) < 0) {
					resultado = elem;
				}
			} catch (PilaVacia e) {
			}
		} else {
			resultado = null;
		}
		return resultado;
	}
	
}






















