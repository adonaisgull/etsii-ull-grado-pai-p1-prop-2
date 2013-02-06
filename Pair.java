/*  ULL-ETSII-GRADO-Programacion de Aplicaciones Interactivas
 *  Ejercicio propuesto 2: Clase Pair generalizada
 */

class Pair<Type> {

	private Type first;
	private Type second;

    public Pair(Type first, Type second) {
        this.first = first;
        this.second = second;
    }

    public String toString() {
        return "[" + getFirst() + ", " + getSecond() + "]";
    }

    public void setFirst(Type first) {
    	this.first = first;
    }

    public Type getFirst() {
    	return first;
    }

    public void setSecond(Type second) {
    	this.second = second;
    }

    public Type getSecond() {
    	return second;
    }
}
