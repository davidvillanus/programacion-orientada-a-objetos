package datos;
public class Agenda {
    private Contactos[] contactos;

    public Agenda(int tamaño){
        this.contactos = new Contactos[tamaño];
    }
    public Agenda(){
        this.contactos = new Contactos[20];
    }
    public void agregarContato(Contactos contact){
        for (int i=0;i<contactos.length && !encontrado;i++) {
            if (contactos[i]=null){
                contactos[i]=contactos[i].getContato();
                encontrado=true;
            }
        }
        if (encontrado){
            System.out.println("AÑADIDO");

        }else{
            System.out.println("NO AÑADIDO");
        }
    }

}