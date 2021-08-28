package datos;

public abstract class Fabricado extends Bebida {
   //atributos
   private String TipoDeSabor;
   private boolean Endulzante;
   private boolean Pitillo;
    //constructores//
    protected Fabricado(String Nombre,long Precio,boolean Stock,int TemperaturaGradosC,String Tamaño,int Calorias,
    String TipoDeSabor,boolean Endulzante,boolean Pitillo){
        super(Nombre,Precio,Stock,TemperaturaGradosC,Tamaño,Calorias);
        this.setTipoDeSabor(TipoDeSabor);
        this.setEndulzante(Endulzante);
        this.setPitillo(Pitillo);
    }
    protected Fabricado(){
        super();
    }
    //METODO TO STRING//
    @Override
    public String toString() {
        return super.toString()+
        "Tipo de sabor: "+this.getTipoDeSabor()+"\n"+
        "Endulzante: "+this.ToStringEndulzante()+"\n"+
        "Pitillo: "+this.ToStringPitillo()+"\n"

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
public final String ToStringPitillo(){
    if (Pitillo){
        return "Si";
    }
    else{
        return "No";
    }

}
public final String ToStringEndulzante(){
    if (Endulzante){
        return "Si";
    }
    else{
        return "No";
    }

}   
}
