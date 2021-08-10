package tienda.src.datos;

public class AvenaConFrutas​ {
  //atributos 
    public int CantidadDeFrutas;
    public String TipoDeAvena;
    public boolean ConJarabeDeArce;
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
}
