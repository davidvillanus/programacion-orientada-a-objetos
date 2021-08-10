package tienda.src.datos;

public class Cerveza {
      //atributos
      public int CantidadDeMililitros;
      public int PorcentajeDeAlcohol;
      public boolean EnJarra;
//metodos
public int getCantidadDeMililitros(){
    return this.CantidadDeMililitros;
}
public int getPorcentajeDeAlhol(){
    return this.PorcentajeDeAlcohol;
}
public boolean getEnJarra(){
    return this.EnJarra;   
}
public void setCantidadDeMililitros(int CantidadDeMililitros){
    this.CantidadDeMililitros = CantidadDeMililitros;
}
public void setPorcentajeDeAlcohol(int PorcentajeDeAlcohol ){
    this.PorcentajeDeAlcohol = PorcentajeDeAlcohol;
}
public void setEnJarra(boolean EnJarra){
    this.EnJarra = EnJarra;
} 
}
