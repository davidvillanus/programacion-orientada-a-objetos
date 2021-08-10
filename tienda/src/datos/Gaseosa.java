package tienda.src.datos;

public class Gaseosa {
    //atributos
    public int CantidadDeLitros;
    public int NumeroDeVasos;
    public String Sabor;
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
