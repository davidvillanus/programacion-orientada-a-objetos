package datos;

public final class Cerveza extends Prefabricado {
      //atributos
      int CantidadDeMililitros;
      int PorcentajeDeAlcohol;
      boolean EnJarra;
    //constructores//
    public Cerveza(String Nombre,long Precio,boolean Stock,int TemperaturaGradosC,String Tamano,int Calorias,
    String Marcar,String Presentacion,boolean ConGas,
    int CantidadDeMililitros,int PorcentajeDeAlcohol,boolean EnJarra){
        super(Nombre,Precio,Stock,TemperaturaGradosC,Tamano,Calorias,Marcar,Presentacion,ConGas);
        this.setCantidadDeMililitros(CantidadDeMililitros);
        this.setPorcentajeDeAlcohol(PorcentajeDeAlcohol);
        this.setEnJarra(EnJarra);
    }
    public Cerveza(){
        super();
    }

    @Override
    public void Descripcion(){
        final String descripcion = "La cerveza ​ es una bebida alcohólica, no destilada, de sabor amargo, que se fabrica con granos de cebada germinados u otros cereales cuyo almidón se fermenta en agua con levadura y se aromatiza a menudo con lúpulo";
        System.out.println(descripcion);
}
    //METODO TO STRING//
    @Override
    public String toString() {
        return super.toString()+
        "Cantidad de mililitros: "+this.getCantidadDeMililitros()+"\n"+
        "Porcentaje de alcohol: "+this.getPorcentajeDeAlcohol()+"\n"+
        "En jarra: "+this.ToStringEnJarra()+"\n"

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
public final String ToStringEnJarra(){
    if (EnJarra){
        return "Si";
    }
    else{
        return "No";
    }

} 
}
