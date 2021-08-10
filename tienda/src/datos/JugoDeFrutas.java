package tienda.src.datos;

public class JugoDeFrutas {
       //atributos
   public boolean ConPulpa;
   public String TipoDeEndulzante;
   public boolean Leche;
//metodos
public boolean ConPulpa(){
    return this.ConPulpa;
}
public String getTipoDeEndulzante(){
    return this.TipoDeEndulzante;
}
public boolean getLeche(){
    return this.Leche;   
}
public void setPrecio(boolean ConPulpa){
    this.ConPulpa = ConPulpa;
}
public void setTipoDeEndulzante(String TipoDeEndulzante){
    this.TipoDeEndulzante = TipoDeEndulzante;
}
public void setCalorias(boolean Leche){
    this.Leche = Leche;
}   
}
