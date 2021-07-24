public class usuario{

    private string nombre;
    private string apellido;
    private long id;
    private string contrasena;
    private string correo;
    private string rol;

    public string getNombre() {
		return this.nombre;
	}

    public string getApellido() {
		return this.Apellido;
	}

    public long getId() {
        return this.id;
    }

    public string getContrasena() {
		return this.nombre;
	}

    public string getCorreo() {
		return this.nombre;
	}

    public string getRol() {
		return this.nombre;
	}

    public void setNombre(string nombre) {
		this.nombre = nombre;
	}

    public void setApellido(string apellido) {
		this.apellido = apellido;
	}

    public void setId(long id){
        this.id = id;
    }

    public void setContrasena(string contrasena) {
		this.contrasena = contrasena;
	}

    public void setCorreo(string correo) {
		this.correo = correo;
	}

    public void setRol(string rol) {
		this.rol = rol;
	}

    	//INTERACCIÓN
	
	public usuario(string nombre, string apellido, long id, string contrasena, string correo, string rol) {
		this.setNombre(nombre);
        this.setApellido(apellido);
		this.setId(id);
        this.setContrasena(contrasena);
        this.setCorreo(correo);
        this.setRol(rol);
	}

}