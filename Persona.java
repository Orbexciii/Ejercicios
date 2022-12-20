
  
public class Persona {


    private String nombre;
    private int edad;
    private int telefono;

    public static void main(String[] args) {
    
    Persona persona1 = new Persona(); 

    persona1.nombre="Carla";
    persona1.edad=(23);
    persona1.telefono=(615941583);

    persona1.informacion();

    persona1.setEdad(24);
    persona1.setNombre("Carla");
    persona1.setTelefono(615941583);


    } 
    public void informacion() {
        System.out.println (getNombre() );
        System.out.println (getEdad());
        System.out.println(getTelefono());
        
    }

    
public String getNombre () {
    return nombre;

}
public void setNombre(String nombre) {
    this.nombre = nombre;
    ;

}

public int getEdad() {
    return edad;
}
public void setEdad(int edad) {
    this.edad = edad;

}

public int getTelefono () {
    return telefono;
}

public void setTelefono(int telefono) {
    this.telefono = telefono;
}



}


