package tienda.src.datos;

public class JugoDeFrutas extends Fabricado {
       //atributos
   public boolean ConPulpa;
   public String TipoDeEndulzante;
   public boolean Leche;
    //constructores//
    public JugoDeFrutas(String Nombre,long Precio,boolean Stock,int TemperaturaGradosC,String Tamaño,int Calorias,
    String TipoDeSabor,boolean Endulzante,boolean Pitillo,
    boolean ConPulpa,String TipoDeEndulzante,boolean leche){
        super(Nombre,Precio,Stock,TemperaturaGradosC,Tamaño,Calorias,
        TipoDeSabor,Endulzante,Pitillo);
        this.setConPulpa(ConPulpa);
        this.setTipoDeEndulzante(TipoDeEndulzante);
        this.setLeche(Leche);
    }
    public JugoDeFrutas(String Nombre,long Precio,boolean Stock,String Tamaño,String TipoDeSabor,
    boolean Leche){
        this(Nombre,Precio,Stock,0,Tamaño,0,TipoDeSabor,false,false,false,"Tipo de endulzante",Leche);
    }
    public JugoDeFrutas(){
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
public boolean ConPulpa(){
    return this.ConPulpa;
}
public String getTipoDeEndulzante(){
    return this.TipoDeEndulzante;
}
public boolean getLeche(){
    return this.Leche;   
}
public void setConPulpa(boolean ConPulpa){
    this.ConPulpa = ConPulpa;
}
public void setTipoDeEndulzante(String TipoDeEndulzante){
    this.TipoDeEndulzante = TipoDeEndulzante;
}
public void setLeche(boolean Leche){
    this.Leche = Leche;
}   
}
