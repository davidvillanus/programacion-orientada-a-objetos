package tienda.src.datos;

public class NoVegano extends Comida {
    //atributos
    public boolean ConQueso;
    public int NumeroDePorciones;
    public boolean ConSalsa;
    //constructores//
    public NoVegano(String Nombre,long Precio,boolean Stock,String[] Ingredientes,boolean ParaLlevar,int Calorias,
    boolean ConQueso,int NumeroDePorciones,boolean ConSalsa){
        super(Nombre,Precio,Stock,Ingredientes,ParaLlevar,Calorias);
        this.setConQueso(ConQueso);
        this.setNumeroDePorciones(NumeroDePorciones);
        this.setConSalsa(ConSalsa);
    }
    public NoVegano(String Nombre,long Precio,boolean Stock,String[] Ingredientes){
        this(Nombre,Precio,true,null,false,0,false,0,false);
    }
    public NoVegano(){
        
    }
    //METODO TO STRING//
    @Override
    public String toString() {
        return super.toString()+
        "Con queso: "+this.getconQueso()+"\n"+
        "Para Llevar: "+this.getNumeroDePorciones()+"\n"+
        "Con salsa: "+this.getConSalsa()+"\n"    
        ;
    }   
    //metodos
public boolean getconQueso() {
    return this.ConQueso;
}
public int getNumeroDePorciones() {
    return this.NumeroDePorciones;
}
public boolean getConSalsa() {
    return this.ConSalsa;
}
public void setConQueso(boolean ConQueso) {
    this.ConQueso = ConQueso;
}
public void setNumeroDePorciones(int NumeroDePorciones){
    this.NumeroDePorciones = NumeroDePorciones;
}
public void setConSalsa(boolean ConSalsa){
    this.ConSalsa = ConSalsa;
}
}
