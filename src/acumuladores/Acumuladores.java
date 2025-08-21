package acumuladores;

public class Acumuladores {

	/**
	 * Dada una matriz de enteros y un número, verifica si existe alguna fila 
	 * donde todos sus elementos sean múltiplos del número recibido por 
	 * parámetro.
	 * 
	 * Si la matriz está vacía o si el número no es positivo, devuelve falso.
	 * 
	 * @param mat
	 * @param num
	 * @return
	 */
	public boolean todosMultiplosEnAlgunaFila(int[][] mat, int num) { 
		
		// si el numero es negativo, o la matriz es vacia, retorna falso.
		if (mat == null || mat.length == 0 || num <= 0) {
			return false;
		}
		
		boolean hayAlgunaFila = false;
		//por cada fila, si todos son multiplos, retorna true. Si no, retorna false.
		for (int f = 0; f < mat.length; f++) {
			hayAlgunaFila |= todosMultiplos(mat[f], num);
		}
		return hayAlgunaFila;
	}
	
	//por cada numero de la fila, retorna false si uno no es multiplo. Si todos son multiplos, retorna true.
	
	///////////////////
	boolean todosMultiplos(int[]fila, int num) {
		boolean todosMultiplos = true;
		for (int elem : fila) {
			todosMultiplos &= esMultiplo(elem, num);
		}
		return todosMultiplos;
	}
	///////////////////
	
	//retorna si n es multiplo de num
	
	///////////////////
	boolean esMultiplo(int n, int num) {
		return n % num == 0;
	}
	///////////////////
	
	/**
	 * Dado 2 matrices se verifica si hay intersección entre las filas de cada
	 * matriz, fila a fila.
	 * 
	 * Si las matrices tienen distinta cantidad de filas o si alguna matriz 
	 * está vacía, devuelve falso.
	 * 
	 * @param mat1
	 * @param mat2
	 * @return
	 */
	public boolean hayInterseccionPorFila(int[][] mat1, int[][]mat2) { 
		if (mat1 == null || mat2 == null || mat1.length == 0 || mat2.length == 0 || mat1.length != mat2.length) {
			return false;
		}
		
		boolean todasLasFilasTienen = true; // acumulador AND (todas las filas)
		for (int i = 0 ; i < mat1.length ; i++) {
			todasLasFilasTienen &= verificacionInterseccion(mat1[i], mat2[i]);
		}
		return todasLasFilasTienen;
	}
	
	boolean verificacionInterseccion(int []f, int[]g) {
		boolean hayInterseccion = false; // acumulador OR (algun numero en comun)
		for (int x : f) {
			for (int z : g) {
				hayInterseccion |= (x == z);
			}
		}
		return hayInterseccion;
	}
	/**
	 * Dada una matriz y el índice de una columna, se verifica si existe alguna
	 * fila cuya suma de todos sus elementos sea mayor estricto que la suma de
	 * todos los elementos de la columna indicada por parámetro.
	 * 
	 * Si el índice de la columna es inválido o la matriz está vacía, devuelve 
	 * falso.
	 * 
	 * @param mat
	 * @param nColum
	 * @return
	 */
	public boolean algunaFilaSumaMasQueLaColumna(int[][] mat, int nColum) { 
		throw new RuntimeException("Metodo no implementado aun!!!");
	}
	
	/**
	 * Dadas 2 matrices, se verifica si hay intersección entre las columnas de
	 * cada matriz, columna a columna.
	 * 
	 * Si las matrices tienen distinta cantidad de columnas o alguna matriz 
	 * está vacía, devuelve falso. 
	 * 
	 * @param mat1
	 * @param mat2
	 * @return
	 */
	public boolean hayInterseccionPorColumna(int[][] mat1, int[][]mat2) { 
		throw new RuntimeException("Metodo no implementado aun!!!");
	}
}
