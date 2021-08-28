package datos;

public final class JugoDeFrutas extends Fabricado {
       //atributos
    boolean ConPulpa;
   String TipoDeEndulzante;
    boolean Leche;
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
    public JugoDeFrutas(){
        super();
    }
    @Override
    public void Descripcion(){
        final String descripcion = "es una sustancia líquida extraída de las frutas, generalmente al exprimirlas por presión";
        System.out.println(descripcion);
    }
    //METODO TO STRING//
    @Override
    public String toString() {
        return super.toString()+
        "Con pulpa: "+this.ToStringConPulpa()+"\n"+
        "Tipo de endulzante: "+this.getEndulzante()+"\n"+
        "Con leche: "+this.ToStringLeche()+"\n"

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

public final String ToStringConPulpa(){
    if (ConPulpa){
        return "Si";
    }
    else{
        return "No ";
    }

} 
public final String ToStringLeche(){
    if (Leche){
        return "Si";
    }
    else{
        return "No";
    }

}
}
