package datos;

public class AvenaConFruta extends Vegana {
      //atributos 
      public int CantidadDeFrutas;
      public String TipoDeAvena;
      public boolean ConJarabeDeArce;
    //constructores//
    public AvenaConFruta (String Nombre,long Precio,boolean Stock,String[] Ingredientes,boolean ParaLlevar,int Calorias,
    boolean ConMani,int NumeroDePorciones,String TipoDeSabor,int CantidadDeFrutas,String TipoDeAvena,boolean ConJarabeDeArce){
        super(Nombre,Precio,Stock,Ingredientes,ParaLlevar,Calorias,
        ConMani,NumeroDePorciones,TipoDeSabor);
        this.setCantidadDeFrutas(CantidadDeFrutas);
        this.setTipoDeAvena(TipoDeAvena);
        this.setConJarabeDeArce(ConJarabeDeArce);
    }
    public AvenaConFruta(){
        super();
    }
    @Override
    public void Descripcion(){
        final String descripcion = "La avena y la fruta son dos de los mejores aliados para acelerar el metabolismo, proporcionarle energía al cuerpo y mantenernos saludables a nivel general. Este desayuno es muy sencillo de preparar.";
        System.out.println(descripcion);
    }
    //METODO TO STRING//
    @Override
    public String toString() {
        return super.toString()+
        "Cantidad de frutas: "+this.getCantidadDeFrutas()+"\n"+
        "TIpo de avena: "+this.getTipoDeAvena()+"\n"+
        "con jaarabe de arce: "+this.ToStringConJarabeDeArce()+"\n"    
        ;
    }

//metodos
public int getCantidadDeFrutas(){
    return this.CantidadDeFrutas;
}
public String getTipoDeAvena(){
    return this.TipoDeAvena;
}
public boolean getConJarabeDeArce(){
    return this.ConJarabeDeArce;
}
public void setCantidadDeFrutas(int CantidadDeFrutas){
    this.CantidadDeFrutas = CantidadDeFrutas;
}
public void setTipoDeAvena(String TipoDeAvena){
    this.TipoDeAvena = TipoDeAvena;
}
public void setConJarabeDeArce(boolean ConJarabeDeArce){
    this.ConJarabeDeArce = ConJarabeDeArce;
} 
public final String ToStringConJarabeDeArce(){
    if (ConJarabeDeArce){
        return "Si";
    }
    else{
        return "No";
    }

} 
    
}
