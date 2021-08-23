package tienda.src.datos;

public class Pizza extends NoVegano{
    //atributos
    public String TipoDeHarina;
    public String RellenoDelBorde;
    public String Tamaño;
    //constructores//
    public Pizza(String Nombre,long Precio,boolean Stock,String[] Ingredientes,boolean ParaLlevar,int Calorias,
    boolean ConQueso,int NumeroDePorciones,boolean ConSalsa,
    String TipoDeHarina,String RellenoDelBorde,String Tamaño){
        super(Nombre,Precio,Stock,Ingredientes,ParaLlevar,Calorias,
        ConQueso,NumeroDePorciones,ConSalsa);
        this.setTipoDeHarina(TipoDeHarina);
        this.setRellenoDelBorde(RellenoDelBorde);
        this.setTamaño(Tamaño);
    }
    public Pizza(String Nombre,long Precio,boolean Stock,String[] Ingredientes,String Tamaño) {
        this(Nombre,Precio,true,null,false,0,false,0,false,"tipo de harina","relleno del borde",Tamaño);
    }
    public Pizza(){
        
    }
    //METODO TO STRING//
    @Override
    public String toString() {
        return super.toString()+
        "Tipo de harina: "+this.getTipoDeHarina()+"\n"+
        "RElleno del borde: "+this.getRellenoDelBorde()+"\n"+
        "Tamaño: "+this.getTamaño()+"\n"    
        ;
    } 
    //metodos
public String getTipoDeHarina() {
    return this.TipoDeHarina;
}
public String getRellenoDelBorde() {
    return this.RellenoDelBorde;
}
public String getTamaño() {
    return this.Tamaño;
}
public void setTipoDeHarina(String TipoDeHarina) {
    this.TipoDeHarina = TipoDeHarina;
}
public void setRellenoDelBorde(String RellenoDelBorde) {
    this.RellenoDelBorde = RellenoDelBorde;
}
public void setTamaño(String Tamaño) {
    this.Tamaño = Tamaño;
}
}
