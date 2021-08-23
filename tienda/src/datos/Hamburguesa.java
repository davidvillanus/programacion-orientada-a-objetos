package tienda.src.datos;

public class Hamburguesa extends NoVegano {
      //atributos
      public String TipoDeCarne;
      public String TipoDePan;
      public String[] Salsas;
    //constructores//
    public Hamburguesa(String Nombre,long Precio,boolean Stock,String[] Ingredientes,boolean ParaLlevar,int Calorias,
    boolean ConQueso,int NumeroDePorciones,boolean ConSalsa,
    String TipoDeCarne,String TipoDePan,String [] Salsas){
        super(Nombre,Precio,Stock,Ingredientes,ParaLlevar,Calorias,
        ConQueso,NumeroDePorciones,ConSalsa);
        this.setTipoDeCarne(TipoDeCarne);
        this.setTipoDePan(TipoDePan);
        this.setSalsas(Salsas);
    }
    public Hamburguesa(String Nombre,long Precio,boolean Stock,String[] Ingredientes,String[] Salsas) {
        this(Nombre,Precio,true,null,false,0,false,0,false,"tipo de carne","tipo de pan",Salsas);
    }
    public Hamburguesa(){
        
    }
    //METODO TO STRING//
    @Override
    public String toString() {
        return super.toString()+
        "Tipo de carne: "+this.getTipoDeCarne()+"\n"+
        "Tipo de pan: "+this.getTipoDePan()+"\n"+
        "Salsas: "+this.getSalsas()+"\n"    
        ;
    }       
   //metodos
   public String getTipoDeCarne(){
       return this.TipoDeCarne;
   }
   public String getTipoDePan(){
       return this.TipoDePan;
   }
   public String[] getSalsas(){
       return this.Salsas;
   }
      
   public void setTipoDeCarne(String TipoDeCarne){
       this.TipoDeCarne=TipoDeCarne;
   }
   public void setTipoDePan(String TipoDePan){
       this.TipoDePan=TipoDePan;
   }
   public void setSalsas(String[] Salsas){
       this.Salsas = Salsas;
   }
   
}
