package tienda.src.datos;

public class Hamburguesa {
      //atributos
      public String TipoDeCarne;
      public String TipoDePan;
      public String[] Salsas;
      
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
