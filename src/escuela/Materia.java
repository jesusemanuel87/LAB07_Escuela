package escuela;

public class Materia {
    private String codigo;
    private String nombre;
    private int anio;
    

    public Materia(String codigo, String nombre, int anio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.anio = anio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return this.getNombre();
    }   
}
