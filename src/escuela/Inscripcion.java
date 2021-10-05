package escuela;
import java.util.Date;

public class Inscripcion {
    private Materia unaMateria;
    private Alumno unAlumno;
    private Date fecha;

    public Inscripcion(Materia unaMateria, Alumno unAlumno, Date fecha) {
        this.unaMateria = unaMateria;
        this.unAlumno = unAlumno;
        this.fecha = fecha;
    }

    public Materia getUnaMateria() {
        return unaMateria;
    }

    public void setUnaMateria(Materia unaMateria) {
        this.unaMateria = unaMateria;
    }

    public Alumno getUnAlumno() {
        return unAlumno;
    }

    public void setUnAlumno(Alumno unAlumno) {
        this.unAlumno = unAlumno;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "unaMateria=" + unaMateria + ", unAlumno=" + unAlumno + ", fecha=" + fecha + '}';
    }
    
}
