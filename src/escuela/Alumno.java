package escuela;

public class Alumno extends Persona{
    
    public Alumno(String identificacion, String nombre, String apellido) {
        super(identificacion, nombre, apellido);
    }  
    
    @Override
    public String toString() {
        return this.getNombre();
    }  
}