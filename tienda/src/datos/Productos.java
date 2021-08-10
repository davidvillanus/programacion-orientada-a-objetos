package tienda.src.datos;

public class Productos {
    //Atributos
    public String Nombre ;
    public long Precio ;
    public boolean Stock ;
 //metodos
 public String getNombre(){
     return this.Nombre;
 }   
public long getPrecio(){
    return this.Precio;
}
public boolean getStock(){
    return this.Stock;
}
public void setNombre(String Nombre){
    this.Nombre =Nombre;
}
public void setPrecio(long Precio){
    this.Precio=Precio;
}
public void setStock(boolean Stock){
    this.Stock = Stock;
}
}
