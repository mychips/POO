import java.util.Formatter;

public class CrearArchivo {
  public static void main(String[] args) {
    Formatter archivo = null;
    try {
      archivo = new Formatter("irchivo.txt");
      archivo.format("%d %s %f %c",25,"Erick Sarmiento",20.5,'&');
    } catch (Exception e) {
      System.out.println("Se ha producido un error"+e.toString());
    }
   
  }
}
