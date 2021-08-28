package datos;

public final class Ensalada extends Vegana{
    //atributos
   public boolean ConAderezo;
   public String TipoDeLechuga;
   public String TipoDeTomate;
    //constructores//
    public Ensalada (String Nombre,long Precio,boolean Stock,String[] Ingredientes,boolean ParaLlevar,int Calorias,
    boolean ConMani,int NumeroDePorciones,String TipoDeSabor,boolean ConAderezo,String TipoDeLechuga,String TipoDeTomate){
        super(Nombre,Precio,Stock,Ingredientes,ParaLlevar,Calorias,
        ConMani,NumeroDePorciones,TipoDeSabor);
        this.setConAderezo(ConAderezo);;
        this.setTipoDeLechuga(TipoDeLechuga);
        this.setTipoDeTomate(TipoDeTomate);
    }
    public Ensalada(){
        super();
    }
    @Override
    public void Descripcion(){
        final String descripcion = "un plato que combina hortalizas frías (como lechuga, rúcula o espinaca) y varias verduras cortadas, mezcladas y aderezadas —fundamentalmente con sal, aceite vegetal y vinagre— a las que se suelen añadir otros alimentos";
        System.out.println(descripcion);
    }
    //METODO TO STRING//
    @Override
    public String toString() {
        return super.toString()+
        "Con aderezo: "+this.ToStringConAderezo()+"\n"+
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
public final String ToStringConAderezo(){
    if (ConAderezo){
        return "Si";
    }
    else{
        return "No";
    }

} 
}
