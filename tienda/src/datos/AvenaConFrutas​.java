package tienda.src.datos;

public class AvenaConFrutas​ extends Vegana {
  //atributos 
    public int CantidadDeFrutas;
    public String TipoDeAvena;
    public boolean ConJarabeDeArce;
    //constructores//
    public AvenaConFrutas​ (String Nombre,long Precio,boolean Stock,String[] Ingredientes,boolean ParaLlevar,int Calorias,
    boolean ConMani,int NumeroDePorciones,String TipoDeSabor,int CantidadDeFrutas,String TipoDeAvena,boolean ConJarabeDeArce){
        super(Nombre,Precio,Stock,Ingredientes,ParaLlevar,Calorias,
        ConMani,NumeroDePorciones,TipoDeSabor);
        this.setCantidadDeFrutas(CantidadDeFrutas);
        this.setTipoDeAvena(TipoDeAvena);
        this.setConJarabeDeArce(ConJarabeDeArce);
    }
    public AvenaConFrutas​(String Nombre,long Precio,boolean Stock,String[] Ingredientes,int CantidadDeFrutas){
        this(Nombre,Precio,false,null,false,0,false,0,"Tipo de sabor",CantidadDeFrutas,"Tipo de avena",false);
    }
    public AvenaConFrutas​(){
        
    }
    //METODO TO STRING//
    @Override
    public String toString() {
        return super.toString()+
        "Cantidad de frutas: "+this.getCantidadDeFrutas()+"\n"+
        "TIpo de avena: "+this.getTipoDeAvena()+"\n"+
        "con jaarabe de arce: "+this.getConJarabeDeArce()+"\n"    
        ;
    }

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
