package Datos;

public class Credito {
    //metodos//
    private int aprobados;
    private int disponibles;
    private int inscritos;
    //constructores//
    public Credito(int aprobados ,int disponibles, int inscritos){
        this.setAprobados(aprobados);
        this.setDisponibles(disponibles);
        this.setInscritos(inscritos);
    }
    public Credito(int aprobados,int disponibles){
        this(aprobados,disponibles,0);
    }
    public Credito(){
        this(0,0,0);
    }
    //atributos//

    public int getAprobados(){
        return this.aprobados;
    }
    public int getDisponibles(){
        return this.disponibles;
    }
    public int getInscritos(){
        return this.inscritos;
    }
    public void setAprobados(int aprobados){
        this.aprobados=aprobados;
    }
    public void setDisponibles(int disponibles){
        this.disponibles=disponibles;
    }
    public void setInscritos(int inscritos){
        this.inscritos=inscritos;
    }
    

    
}
