package datos;

public abstract class NoVegano extends Comida {
    //atributos
    private boolean ConQueso;
    private int NumeroDePorciones;
    private boolean ConSalsa;
    //constructores//
    protected NoVegano(String Nombre,long Precio,boolean Stock,String[] Ingredientes,boolean ParaLlevar,int Calorias,
    boolean ConQueso,int NumeroDePorciones,boolean ConSalsa){
        super(Nombre,Precio,Stock,Ingredientes,ParaLlevar,Calorias);
        this.setConQueso(ConQueso);
        this.setNumeroDePorciones(NumeroDePorciones);
        this.setConSalsa(ConSalsa);
    }
    protected NoVegano(){
        super();
    }
    //METODO TO STRING//
    @Override
    public String toString() {
        return super.toString()+
        "Con queso: "+this.ToStringConQueso()+"\n"+
        "Para Llevar: "+this.getNumeroDePorciones()+"\n"+
        "Con salsa: "+this.ToStringConSalsa()+"\n"    
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
public final String ToStringConQueso(){
    if (ConQueso){
        return "Si";
    }
    else{
        return "No";
    }

}
public final String ToStringConSalsa(){
    if (ConSalsa){
        return "Si";
    }
    else{
        return "No";
    }

} 
}
