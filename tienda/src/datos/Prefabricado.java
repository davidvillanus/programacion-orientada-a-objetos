package datos;

public abstract class Prefabricado extends Bebida{
      //atributos
   private String Marca;
   private String Presentacion;
   private boolean ConGas;
    //constructores//
    protected Prefabricado(String Nombre,long Precio,boolean Stock,int TemperaturaGradosC,String Tamaño,int Calorias,
    String Marcar,String Presentacion,boolean ConGas){
        super(Nombre,Precio,Stock,TemperaturaGradosC,Tamaño,Calorias);
        this.setMarca(Marca);
        this.setPresentacion(Presentacion);
        this.setConGas(ConGas);
    }

    protected Prefabricado(){
        super();
    }
    //METODO TO STRING//
    @Override
    public String toString() {
        return super.toString()+
        "Marca: "+this.getMarca()+"\n"+
        "Presentacion: "+this.getPresentacion()+"\n"+
        "Con gas: "+this.ToStringConGas()+"\n"

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
public final String ToStringConGas(){
    if (ConGas){
        return "Si";
    }
    else{
        return "No";
    }

}
}
