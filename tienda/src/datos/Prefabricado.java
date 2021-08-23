package tienda.src.datos;

public class Prefabricado extends Bebida{
      //atributos
   public String Marca;
   public String Presentacion;
   public boolean ConGas;
    //constructores//
    public Prefabricado(String Nombre,long Precio,boolean Stock,int TemperaturaGradosC,String Tamaño,int Calorias,
    String Marcar,String Presentacion,boolean ConGas){
        super(Nombre,Precio,Stock,TemperaturaGradosC,Tamaño,Calorias);
        this.setMarca(Marca);
        this.setPresentacion(Presentacion);
        this.setConGas(ConGas);
    }
    public Prefabricado(String Nombre,long Precio,boolean Stock,String Tamaño,String Marca){
        this(Nombre,Precio,Stock,0,Tamaño,0,Marca,"Presentacion",false);
    }
    public Prefabricado(){
    }
    //METODO TO STRING//
    @Override
    public String toString() {
        return super.toString()+
        "Marca: "+this.getMarca()+"\n"+
        "Presentacion: "+this.getPresentacion()+"\n"+
        "Con gas: "+this.getConGas()+"\n"

        ;
    }   
   
//metodos
public String getMarca(){
    return this.Marca;
}
public String getPresentacion(){
    return this.Presentacion;
}
public boolean getConGas(){
    return this.ConGas;
}
   
public void setMarca(String Marca){
    this.Marca=Marca;
}
public void setPresentacion(String Presentacion){
    this.Presentacion=Presentacion;
}
public void setConGas(boolean ConGas){
    this.ConGas = ConGas;
}

}
