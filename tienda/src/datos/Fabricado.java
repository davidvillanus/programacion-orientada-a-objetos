package tienda.src.datos;

public class Fabricado extends Bebida {
   //atributos
   public String TipoDeSabor;
   public boolean Endulzante;
   public boolean Pitillo;
    //constructores//
    public Fabricado(String Nombre,long Precio,boolean Stock,int TemperaturaGradosC,String Tamaño,int Calorias,
    String TipoDeSabor,boolean Endulzante,boolean Pitillo){
        super(Nombre,Precio,Stock,TemperaturaGradosC,Tamaño,Calorias);
        this.setTipoDeSabor(TipoDeSabor);
        this.setEndulzante(Endulzante);
        this.setPitillo(Pitillo);
    }
    public Fabricado(String Nombre,long Precio,boolean Stock,String Tamaño,String TipoDeSabor){
        this(Nombre,Precio,Stock,0,Tamaño,0,TipoDeSabor,false,false);
    }
    public Fabricado(){
    }
    //METODO TO STRING//
    @Override
    public String toString() {
        return super.toString()+
        "Tipo de sabor: "+this.getTipoDeSabor()+"\n"+
        "Endulzante: "+this.getEndulzante()+"\n"+
        "Pitillo: "+this.getPitillo()+"\n"

        ;
    }   

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
