package test;
import java.util.Arrays;

public class Asiento {
  public String color;
  public int precio;
  public int registro;

  public void cambiarColor(String color){

    String[] colores = {"blanco","verde","rojo","negro","amarillo"};
    if (Arrays.asList(colores).contains(color)){
      this.color = color;
    }
  }
}
