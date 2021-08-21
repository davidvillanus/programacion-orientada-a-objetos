class Usuario{
    constructor (nombre,apellido,id,contraseña,correo,rol){
    this.#nombre = nombre;
    this.#apellido =apellido;
    this.#id = id;
    this.#contraseña = contraseña;
    this.#correo=coreo;
    this.#rol= rol;
    }
    get nombre(){
        return this.#nombre;
    }
    set nombre(nombre){
        this.#nombre=nombre;
    }
}

const Usuario1= new Usuario();

class Materia{
    constructor(nombre,youtubers){
        this.#nombre=nombre;
        this.#youtuber=youtuber;
    }
    get nombre(){
        return this.#nombre;
    }    
}
class Youtuber{
    constructor(nombre,edad,Materia,UsuarioYt,videoPresentacion){
    this.#nombre=nombre;
    this.#edad=edad;
    this.#Materia=Materia;
    this.#UsuarioYt=UsuarioYT;
    this.#videoPresentacion=videoPresentacion;      
    }
}
class canal{
    constructor(nombreCanal,nombreProfe,descripcion,redesSociales){
        this.#nombreCanal=nombreCanal;
        this.#nombreProfe=nombreProfe;
        this.#descripcion=descripcion;
        this.#redesSocialesl=redesSociales;
    }

}



