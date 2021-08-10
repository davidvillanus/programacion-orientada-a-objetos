package tienda.src.datos;

public class Fabricado {
   //atributos
   public String TipoDeSabor;
   public boolean Endulzante;
   public boolean Pitillo;
//metodos
public String getTipoDeSabor(){
    return this.TipoDeSabor;
}
public boolean getEndulzante(){
    return this.Endulzante;
}
public boolean getPitillo(){
    return this.Pitillo;   
}
public void setTipoDeSabor(String TipoDeSabor){
    this.TipoDeSabor = TipoDeSabor;
}
public void setEndulzante(boolean Endulzante){
    this.Endulzante = Endulzante;
}
public void setPitillo(boolean Pitillo){
    this.Pitillo = Pitillo;
}    
}
