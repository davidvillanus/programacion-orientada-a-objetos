package datos;

public abstract class Comida extends Productos {
    //Atributos
    private String[] Ingredientes ;
    private boolean ParaLlevar ;
    private int Calorias ;

    //constructores//
    protected Comida(String Nombre,long Precio,boolean Stock,String[] Ingredientes,boolean ParaLlevar,int Calorias){
        super(Nombre,Precio,Stock);
        this.setIngredientes(Ingredientes);
        this.setParaLlevar(ParaLlevar);
        this.setCalorias(Calorias);
    }
    protected Comida(){
        super();
    }
    //METODO TO STRING//
    @Override
    public String toString() {
        return super.toString()+
        "Ingredientes: "+this.getIngredientes()+"\n"+
        "ParaLlevar: "+this.ToStringParallevar()+"\n"+
        "Calorias: "+this.getCalorias()+"\n"    
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
    public final String ToStringParallevar(){
        if (ParaLlevar){
            return "Si";
        }
        else{
            return "No";
        }
    
    } 
}
