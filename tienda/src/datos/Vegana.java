package tienda.src.datos;

public class Vegana {
    //atributos
    public boolean ConMani;
    public int NumeroDePorciones;
    public String TipoDeSabor;
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
