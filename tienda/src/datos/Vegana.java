package datos;

public abstract class Vegana extends Comida {
    //atributos
    private boolean ConMani;
    private int NumeroDePorciones;
    private String TipoDeSabor;
    //constructores//
    protected Vegana(String Nombre,long Precio,boolean Stock,String[] Ingredientes,boolean ParaLlevar,int Calorias,
    boolean ConMani,int NumeroDePorciones,String TipoDeSabor){
    super(Nombre,Precio,Stock,Ingredientes,ParaLlevar,Calorias);
    this.setConMani(ConMani);
    this.setNumeroDePorciones(NumeroDePorciones);
    this.setTipoDeSabor(TipoDeSabor);
    }
    
    protected Vegana(){
        super();
        
    }
    //METODO TO STRING//
    @Override
    public String toString() {
        return super.toString()+
        "Con mani: "+this.ToStringConMani()+"\n"+
        "Numero de porciones: "+this.getNumeroDePorciones()+"\n"+
        "TIpo de sabor: "+this.getTipoDeSabor()+"\n"    
        ;
    }
    //metodos
public boolean getConMani(){
    return this.ConMani; 
}
public int getNumeroDePorciones(){
    return this.NumeroDePorciones; 
}
public String getTipoDeSabor(){
    return this.TipoDeSabor;
}
public void setConMani(boolean conMani){
    this.ConMani = conMani;
}
public void setNumeroDePorciones(int numeroDePorciones){
    this.NumeroDePorciones = numeroDePorciones;
}
public void setTipoDeSabor(String tipoDeSabor){
    this.TipoDeSabor = tipoDeSabor;
}
public final String ToStringConMani(){
    if (ConMani){
        return "Si";
    }
    else{
        return "No";
    }

} 
}
