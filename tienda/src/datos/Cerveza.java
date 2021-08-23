package tienda.src.datos;

public class Cerveza extends Prefabricado {
      //atributos
      public int CantidadDeMililitros;
      public int PorcentajeDeAlcohol;
      public boolean EnJarra;
    //constructores//
    public Cerveza(String Nombre,long Precio,boolean Stock,int TemperaturaGradosC,String Tamaño,int Calorias,
    String Marcar,String Presentacion,boolean ConGas,
    int CantidadDeMililitros,int PorcentajeDeAlcohol,boolean EnJarra){
        super(Nombre,Precio,Stock,TemperaturaGradosC,Tamaño,Calorias,Marcar,Presentacion,ConGas);
        this.setCantidadDeMililitros(CantidadDeMililitros);
        this.setPorcentajeDeAlcohol(PorcentajeDeAlcohol);
        this.setEnJarra(EnJarra);
    }
    public Cerveza(String Nombre,long Precio,boolean Stock,String Tamaño,String Marca,boolean EnJarra){
        this(Nombre,Precio,Stock,0,Tamaño,0,Marca,"Presentacion",false,0,0,EnJarra);
    }
    public Cerveza(){
    }
    //METODO TO STRING//
    @Override
    public String toString() {
        return super.toString()+
        "Cantidad de mililitros: "+this.getCantidadDeMililitros()+"\n"+
        "Porcentaje de alcohol: "+this.getPorcentajeDeAlcohol()+"\n"+
        "En jarra: "+this.getEnJarra()+"\n"

        ;
    }   
   
      //metodos
public int getCantidadDeMililitros(){
    return this.CantidadDeMililitros;
}
public int getPorcentajeDeAlcohol(){
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
