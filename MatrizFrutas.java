import javax.swing.JOptionPane;

public class MatrizFrutas {
  public static void main(String[] args) {
    
    // int filas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de filas de la matriz"));
    // int columnas = Integer.parseInt((JOptionPane.showInputDialog("Introduce el numero de columnas de la matriz")));
    
    int filas = 2;
    int columnas = 2;
    String [][] frutas = new String[filas][columnas];
    frutas[0][0] = "1 Durazno";
    frutas[0][1] = "2 Manzana";
    frutas[1][0] = "3 Pera";
    frutas[1][1] = "4 Pina";
    
   
    // System.out.println("Introduce las frutas que vas a vender");
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        System.out.print(frutas[i][j] + " ");
      }
      System.out.println();
    }
  }
}
