package tienda.src.datos;

public class Productos {
    //Atributos
    public String Nombre ;
    public long Precio ;
    public boolean Stock ;
    //constructores//
    public Productos(String Nombre,long Precio,boolean Stock){
        this.setNombre(Nombre);
        this.setPrecio(Precio);
        this.setStock(Stock);
    }
    public Productos(String Nombre,long Precio){
        this(Nombre,Precio,false);
    }
    public Productos(){
    }
    //METODO TO STRING//
    @Override
    public String toString() {
        return "\n"+"nombre: "+this.getNombre()+"\n"+
        "Precio: "+this.getPrecio()+"\n"+
        "Stock : "+this.getStock()+"\n";
    }
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
