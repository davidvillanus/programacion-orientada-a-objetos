package tienda.src.datos;

public class PizzaDechampiñones {
      //atributos
   public long precio;
   public String[] ingredientes;
   public int calorias;
//metodos
public long getPrecio(){
    return this.precio;
}
public String[] getIngredientes(){
    return this.ingredientes;
}
public int getCalorias(){
    return this.calorias;   
}
public void setPrecio(long precio){
    this.precio = precio;
}
public void setingredientes(String[] ingredientes){
    this.ingredientes = ingredientes;
}
public void setCalorias(int calorias){
    this.calorias = calorias;
} 
}
