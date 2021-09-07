package datos;
public class Contactos {
    private String Nombre;
    private long telefono;

public Contacto(String Nombre ,long telefono) {
   this.Nombre = Nombre; 
   this.telefono = telefono;      
}
public String getNombre(){
    return Nombre;

}
public void setNombre(String Nombre){
    this.Nombre = Nombre;
}
public long gettelefono(){
    return telefono;
}
public void settelefono(long telefono){
    this.telefono = telefono;
}

@Override
public String toString(){
    return "Nombre" + Nombre +" \n"+ "Telefono"+ telefono;
}


}
