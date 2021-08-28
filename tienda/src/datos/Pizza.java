package datos;

public final class Pizza extends NoVegano{
    //atributos
    String TipoDeHarina;
    String RellenoDelBorde;
    String Tamaño;
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
    public Pizza(){
        super();
    }
    @Override
    public void Descripcion(){
        final String descripcion = "La pizza es una preparación culinaria que consiste en un pan plano, habitualmente de forma circular, elaborado con harina de trigo, levadura, agua y sal que tradicionalmente se cubre con salsa de tomate y queso y se hornea a alta temperatura en un horno de leña.";
        System.out.println(descripcion);
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
