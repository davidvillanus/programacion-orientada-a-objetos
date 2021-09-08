package datos;
public class Agenda {
    private Contactos[] contactos;

    public Agenda(int tamaño){
        this.contactos = new Contactos[tamaño];
    }
    public Agenda(){
        this.contactos = new Contactos[20];
    }
    public void agregarcontacto(Contactos contact){

        if(existecontacto(contact)){
            System.out.println("El contacto con ese nombre ya existe");

        }else if (agendallena()){
            System.out.println("Agenda llena, no se pueden agragar más contactos");
        }else{

            boolean encontrado = false;
            for (int i=0;i<contactos.length && !encontrado;i++) {
                if (contactos[i]==null){
                    contactos[i]=contactos[i].getContacto();
                    encontrado=true;
                }
            }
            if (encontrado){
                System.out.println("AÑADIDO");

            }
            else{
                System.out.println("NO AÑADIDO");
            }
        }
    }

    public boolean existecontacto (Contactos contact){
        boolean encontrado = false;
        for (int i=0;i<contactos.length; i++) {
            if (contactos[i]!=null && contact.equials(Contactos[i])){

                encontrado=true;
            }

        }
        return false;
    }

    public void listacontacos(){

        for (int i=0;i<Contactos.length; i++) {
            if (contactos[i]!=null) {
                System.out.println(Contactos[i]);
            }

        }

    }

    public void buscarcontactos(String nombre){
        boolean encontrado= false;
        for (int i=0;i<Contactos.length; i++) {
            if(Contactos[i]!=null && Contactos[i].getNombre().equalsIgnoreCase(Nombre)){
                System.out.println("Telefono: "+ Contactos[i].gettelefono);
                encontrado=true;
            }
        }

        if (!encontrado){
            System.out.println("Contacto no encontrado");
        }
    }
    public boolean agendallena(){

        for (int i=0;i<Contactos.length; i++) {
            if(Contactos[i]==null){
                return false;
            }
         }

        return true;

    }

    public void eliminarcontactos(Contatacos c){
        boolean encontrado = false;
        for (int i=0;i<Contactos.length; i++) {
            if(Contactos[i]==null && Contactos[i].equals(contact)){
                contactos[i]=null;
                encontrado=true;
            }
        }
        if (encontrado){
            System.out.println("No se ha eliminado el contacto");
        }
    }

    public int espacioslibres(){
        int contadorlibre=0;
        for (int i=0;i<Contactos.length; i++) {
            if(Contactos[i]==null){
                contadorlibre++;
            }
         }
    
    }


}