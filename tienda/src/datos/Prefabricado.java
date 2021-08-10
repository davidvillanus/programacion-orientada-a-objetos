package tienda.src.datos;

public class Prefabricado {
      //atributos
   public String Marca;
   public String Presentacion;
   public boolean ConGAs;
   
//metodos
public String getMarca(){
    return this.Marca;
}
public String getPresentacion(){
    return this.Presentacion;
}
public boolean getConGAs(){
    return this.ConGAs;
}
   
public void setTipoDeCarne(String Marca){
    this.Marca=Marca;
}
public void setTipoDePan(String Presentacion){
    this.Presentacion=Presentacion;
}
public void setSalsas(boolean ConGAs){
    this.ConGAs = ConGAs;
}

}
