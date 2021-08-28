package datos;

public final class Gaseosa extends Prefabricado {
    //atributos
    int CantidadDeLitros;
    int NumeroDeVasos;
    String Sabor;
    //constructores//
    public Gaseosa(String Nombre,long Precio,boolean Stock,int TemperaturaGradosC,String Tamaño,int Calorias,
    String Marcar,String Presentacion,boolean ConGas,
    int CantidadDeLitros,int NumeroDeVasos,String Sabor){
        super(Nombre,Precio,Stock,TemperaturaGradosC,Tamaño,Calorias,Marcar,Presentacion,ConGas);
        this.setCantidadDeLitros(CantidadDeLitros);
        this.setNumeroDeVasos(NumeroDeVasos);
        this.setSabor(Sabor);
    }
    public Gaseosa(){
        super();
    }
    @Override
    public void Descripcion(){
        final String descripcion = "La cerveza ​ es una bebida alcohólica, no destilada, de sabor amargo, que se fabrica con granos de cebada germinados u otros cereales cuyo almidón se fermenta en agua con levadura y se aromatiza a menudo con lúpulo";
        System.out.println(descripcion);
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
