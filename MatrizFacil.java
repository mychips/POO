public class MatrizFacil {
  public static void main(String[] args) {
    int[][] numeros; // un array multidimensional de numeros enteros
    int i, j; // para recorrer el array: i=Filas, j=Colas
    
    // Este array tiene 2 filas y 3 columnas
    numeros = new int[5][8];
    
    for (i=0; i<numeros.length; i++) { // Recorre las filas
      for (j=0; j<numeros[i].length; j++) { // de cada fila se recorren todas las columnas
        numeros[i][j] = 0;
        System.out.print(numeros[i][j] + " "); // se imprime lo elementos de una fila
      }
      System.out.println(); // se imprime un salto de linea para mostrar la fila de abajo
    }
  }  
}
