
import java.io.File;

import java.io.PrintWriter;


public class CrearArchivo2 {
  public static void main(String[] args) {
    File miArchivo;
    
    PrintWriter escribir;

    miArchivo = new File("miArchivo.txt");

    if(!miArchivo.exists()) {
      try {
        miArchivo.createNewFile();
      } catch (Exception e) {}
    } else {
      try {
        escribir = new PrintWriter(miArchivo, "utf-8");
        escribir.println("Hola chamacos ponganse las pilas");
        escribir.close();  
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

  }
}
