/*  ULL-ETSII-GRADO-Programacion de Aplicaciones Interactivas
 *  Ejercicio propuesto 2: Clase Propuesto1 para usar Pair generalizada
 */

class Propuesto1 {

	public static void main(String argv[]){
		Pair<Integer> pairInteger = new Pair<Integer>(1, 2);
		Pair<Double> pairDouble = new Pair<Double>(1.5, 2.5);
		Pair<Boolean> pairBoolean = new Pair<Boolean>(true, false);
		Pair<String> pairString = new Pair<String>("alfa", "beta");
		
		System.out.println("Par de enteros:   " + pairInteger);
		System.out.println("Par de dobles:    " + pairDouble);
		System.out.println("Par de boleanos:  " + pairBoolean);
		System.out.println("Par de cadenas:   " + pairString);
	}
}