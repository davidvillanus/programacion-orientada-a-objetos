package tienda.src.datos;

public class Bebida {
   //atributos
   public int TemperaturaGradosC;
   public String Tamaño;
   public int Calorias;
//metodos
public int getTemperaturaGradosC(){
    return this.TemperaturaGradosC;
}
public String getTamaño(){
    return this.Tamaño;
}
public int getCalorias(){
    return this.Calorias;   
}
public void setTemperaturaGradosC(int TemperaturaGradosC){
    this.TemperaturaGradosC = TemperaturaGradosC;
}
public void setTamaño(String Tamaño){
    this.Tamaño = Tamaño;
}
public void setCalorias(int Calorias){
    this.Calorias = Calorias;
}    
}
