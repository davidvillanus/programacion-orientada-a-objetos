package tienda.src.datos;

public class NoVegano {
    //atributos
    public boolean ConQueso;
    public int NumeroDePorciones;
    public boolean ConSalsa;
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
