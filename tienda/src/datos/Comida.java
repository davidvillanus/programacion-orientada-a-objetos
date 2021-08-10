package tienda.src.datos;

public class Comida {
    //Atributos
    public String[] Ingredientes ;
    public boolean ParaLlevar ;
    public int Calorias ;
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
    public void setingredientes(String[] Ingredientes ){
        this. Ingredientes = Ingredientes;
    }
    public void setParaLlevar(boolean ParaLlevar){
        this.ParaLlevar = ParaLlevar;
    }
    public void setCalorias(int Calorias){
        this.Calorias=Calorias;
    }
}
