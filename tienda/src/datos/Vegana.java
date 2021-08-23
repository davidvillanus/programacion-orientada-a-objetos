package tienda.src.datos;

public class Vegana extends Comida {
    //atributos
    public boolean ConMani;
    public int NumeroDePorciones;
    public String TipoDeSabor;
    //constructores//
    public Vegana(String Nombre,long Precio,boolean Stock,String[] Ingredientes,boolean ParaLlevar,int Calorias,
    boolean ConMani,int NumeroDePorciones,String TipoDeSabor){
    super(Nombre,Precio,Stock,Ingredientes,ParaLlevar,Calorias);
    this.setConMani(ConMani);
    this.setNumeroDePorciones(NumeroDePorciones);
    this.setTipoDeSabor(TipoDeSabor);
    }
    public Vegana(String Nombre,long Precio,boolean Stock,String[] Ingredientes){
        this(Nombre,Precio,false,null,false,0,false,0,"Tipo de sabor");
    }
    public Vegana(){
        
    }
    //METODO TO STRING//
    @Override
    public String toString() {
        return super.toString()+
        "Con mani: "+this.getConMani()+"\n"+
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
}
