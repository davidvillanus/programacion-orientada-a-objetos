package tienda.src.datos;

public class Gaseosa extends Prefabricado {
    //atributos
    public int CantidadDeLitros;
    public int NumeroDeVasos;
    public String Sabor;
    //constructores//
    public Gaseosa(String Nombre,long Precio,boolean Stock,int TemperaturaGradosC,String Tamaño,int Calorias,
    String Marcar,String Presentacion,boolean ConGas,
    int CantidadDeLitros,int NumeroDeVasos,String Sabor){
        super(Nombre,Precio,Stock,TemperaturaGradosC,Tamaño,Calorias,Marcar,Presentacion,ConGas);
        this.setCantidadDeLitros(CantidadDeLitros);
        this.setNumeroDeVasos(NumeroDeVasos);
        this.setSabor(Sabor);
    }
    public Gaseosa(String Nombre,long Precio,boolean Stock,String Tamaño,String Marca,String Sabor){
        this(Nombre,Precio,Stock,0,Tamaño,0,Marca,"Presentacion",false,0,0,Sabor);
    }
    public Gaseosa(){
    }
    //METODO TO STRING//
    @Override
    public String toString() {
        return super.toString()+
        "Cantidad de litros: "+this.getCantidadDeLitros()+"\n"+
        "Numero de vasos: "+this.getNumeroDeVasos()+"\n"+
        "Sabor: "+this.getSabor()+"\n"

        ;
    }   
       //metodos
public int getCantidadDeLitros() {
    return this.CantidadDeLitros;
}
public int getNumeroDeVasos() {
    return this.NumeroDeVasos;
}
public String getSabor(){
    return this.Sabor;
}
public void setCantidadDeLitros(int CantidadDeLitros) {
    this.CantidadDeLitros = CantidadDeLitros;
}
public void setNumeroDeVasos(int NumeroDeVasos) {
    this.NumeroDeVasos = NumeroDeVasos;
}
public void setSabor(String Sabor) {
    this.Sabor = Sabor;
}
}
