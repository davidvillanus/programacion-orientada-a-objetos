package datos;

public abstract class Productos {
	
    //Atributos
    private String Nombre  ;
    private long Precio ;
    private boolean Stock ;
    public abstract void Descripcion();
    
    //constructores//
    protected Productos(String Nombre,long Precio,boolean Stock){
        this.setNombre(Nombre);
        this.setPrecio(Precio);
        this.setStock(Stock);
    }
    protected Productos(){
    }
    
    //METODO TO STRING//
    @Override
    public String toString() {
        return "\n"+"nombre: "+this.getNombre()+"\n"+
        "Precio: "+this.getPrecio()+"\n"+
        "Stock : "+this.ToStringStock()+"\n";
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
	public final String ToStringStock(){
	    if (Stock){
	        return "Disponible";
	    }
	    else{
	        return "No Disponible";
	    }
	} 
}
