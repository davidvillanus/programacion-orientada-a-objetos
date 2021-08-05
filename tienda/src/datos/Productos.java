package tienda.src.datos;

public class Productos {
    //Atributos
    public String nombre ;
    public String NombreChef;
    public boolean stock ;
 //metodos
 public String getNombre(){
     return this.nombre;
 }   
public String getNombreChef(){
    return this.NombreChef;
}
public boolean getStock(){
    return this.stock;
}
public void setNombre(String nombre){
    this.nombre = nombre;
}
public void setNombreChef(String NombreChef){
    this.NombreChef=NombreChef;
}
public void setStock(boolean stock){
    this.stock = stock;
}
}
