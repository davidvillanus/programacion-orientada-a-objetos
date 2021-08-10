package tienda.src.datos;

public class EnsaladaCobbVegana {
    //atributos
   public boolean ConAderezo;
   public String TipoDeLechuga;
   public String TipoDeTomate;
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
public void setTipoDeLechugar(String TipoDeLechuga){
    this.TipoDeLechuga= TipoDeLechuga;
}
public void setTipoDeTomate(String TipoDeTomate){
    this.TipoDeTomate = TipoDeTomate;
}
}
