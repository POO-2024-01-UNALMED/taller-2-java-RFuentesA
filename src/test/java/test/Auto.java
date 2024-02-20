package test;
import java.util.*;

public class Auto{

  public String modelo;
  public int precio;
  public Asiento[] asientos;
  public String marca;
  public Motor motor;
  public int registro;
  public int cantidadCreados;

   public int cantidadAsientos(){
    int asientos = 0;
    for (int i = 0; i < this.asientos.length; i++){
      if (this.asientos[i] != null){
        asientos ++;
      }
    }
    return asientos;
  }

  public String verificarIntegridad(){
    if (this.registro == this.motor.registro){
      for (int i = 0; i < this.asientos.length; i++){
        if (this.asientos[i] != null && this.asientos[i].registro != this.registro){
          return "Las piezas no son originales";
        }
      }
      return "Auto original"
    }
    else {
      return "Las piezas no son originales";
    }

    
  }  
}
