package pe.edu.cibertec.apprestventas.exceptions;


//aplicamos la herencia
public class ResourcesNotFoundException extends RuntimeException {

    //constructor
    public ResourcesNotFoundException(String mensaje) {
        super(mensaje);
    }


}
