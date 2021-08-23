package tienda.src.datos;

public class Comida extends Productos {
    //Atributos
    public String[] Ingredientes ;
    public boolean ParaLlevar ;
    public int Calorias ;

    //constructores//
    public Comida(String Nombre,long Precio,boolean Stock,String[] Ingredientes,boolean ParaLlevar,int Calorias){
        super(Nombre,Precio,Stock);
        this.setIngredientes(Ingredientes);
        this.setParaLlevar(ParaLlevar);
        this.setCalorias(Calorias);
    }
    public Comida(String Nombre,long Precio,boolean Stock,String[] Ingredientes){
        this(Nombre,Precio,false,null,false,0);
    }
    public Comida(){
        
    }
    //METODO TO STRING//
    @Override
    public String toString() {
        return super.toString()+
        "Ingredientes: "+this.getIngredientes()+"\n"+
        "ParaLlevar"+this.getParaLlevar()+"\n"+
        "Calorias"+this.getCalorias()+"\n"    
        ;
    }
     //metodos
    public String[] getIngredientes( ){
         return this.Ingredientes;
     }   
    public boolean getParaLlevar(){
        return this.ParaLlevar;
    }
    public int getCalorias(){
        return this.Calorias;
    }
    public void setIngredientes(String[] Ingredientes ){
        this. Ingredientes = Ingredientes;
    }
    public void setParaLlevar(boolean ParaLlevar){
        this.ParaLlevar = ParaLlevar;
    }
    public void setCalorias(int Calorias){
        this.Calorias=Calorias;
    }
}
