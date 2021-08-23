package tienda.src.datos;

public class EnsaladaCobbVegana extends Vegana{
    //atributos
   public boolean ConAderezo;
   public String TipoDeLechuga;
   public String TipoDeTomate;
    //constructores//
    public EnsaladaCobbVegana (String Nombre,long Precio,boolean Stock,String[] Ingredientes,boolean ParaLlevar,int Calorias,
    boolean ConMani,int NumeroDePorciones,String TipoDeSabor,boolean ConAderezo,String TipoDeLechuga,String TipoDeTomate){
        super(Nombre,Precio,Stock,Ingredientes,ParaLlevar,Calorias,
        ConMani,NumeroDePorciones,TipoDeSabor);
        this.setConAderezo(ConAderezo);;
        this.setTipoDeLechuga(TipoDeLechuga);
        this.setTipoDeTomate(TipoDeTomate);
    }
    public EnsaladaCobbVegana(String Nombre,long Precio,boolean Stock,String[] Ingredientes,boolean ConAderezo){
        this(Nombre,Precio,false,null,false,0,false,0,"Tipo de sabor",ConAderezo,"Tipo de lechuga","Tipo de Tomate");
    }
    public EnsaladaCobbVegana(){
        
    }
    //METODO TO STRING//
    @Override
    public String toString() {
        return super.toString()+
        "Con aderezo: "+this.getConAderezo()+"\n"+
        "TIpo de lechuga: "+this.getTipoDeLechuga()+"\n"+
        "TIpo de Tomate: "+this.getTipoDeTomate()+"\n"    
        ;
    }

//metodos
public boolean getConAderezo(){
    return this.ConAderezo;
}
public String getTipoDeLechuga(){
    return this.TipoDeLechuga;
}
public String getTipoDeTomate(){
    return this.TipoDeTomate;
}
public void setConAderezo(boolean ConAderezo){
    this.ConAderezo = ConAderezo;
}
public void setTipoDeLechuga(String TipoDeLechuga){
    this.TipoDeLechuga= TipoDeLechuga;
}
public void setTipoDeTomate(String TipoDeTomate){
    this.TipoDeTomate = TipoDeTomate;
}
}
