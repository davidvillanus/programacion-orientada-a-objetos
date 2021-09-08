package datos;

public abstract class Bebida extends Productos {
   //atributos
   private int TemperaturaGradosC;
   private String Tamaño;
   private int Calorias;
    //constructores//
    protected Bebida(String Nombre,long Precio,boolean Stock,int TemperaturaGradosC,String Tamaño,int Calorias){
        super(Nombre,Precio,Stock);
        this.setTemperaturaGradosC(TemperaturaGradosC);
        this.setTamaño(Tamaño);
        this.setCalorias(Calorias);
    }
    protected Bebida(){
        super();
    }
    //METODO TO STRING//
    @Override
    public String toString() {
        return super.toString()+
        "Temperatura en Grados Celsius: "+this.getTemperaturaGradosC()+"\n"+
        "Tamaño: "+this.getTamaño()+"\n"+
        "Calorias: "+this.getCalorias()+"\n"

        ;
    }   
   
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
