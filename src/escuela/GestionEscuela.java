package escuela;
import java.util.ArrayList;

public class GestionEscuela {
    public static ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    public static ArrayList<Materia> listaMaterias = new ArrayList<>();
    public static ArrayList<Inscripcion> listaInscripciones = new ArrayList<>();
    
    /**
     * Agrega un alumno a la lista de Alumno
     * @param unAlumno 
     */
    public static void agregarAlumno(Alumno unAlumno){
        listaAlumnos.add(unAlumno);
    }
    
    public static void agregarMateria(Materia unaMateria){
        listaMaterias.add(unaMateria);
    }
    
    public static void agregarInscripcion(Inscripcion unaInscripcion){
        listaInscripciones.add(unaInscripcion);
    }
    
   /**
    * Método que verifica si existe un alumno dada la
    * identificación
    * @param identificacion
    * @return true o false
    */
    public static boolean existeAlumno(String identificacion){
        boolean existe=false;
        int tamaLista = listaAlumnos.size();
        for (int i=0;i<tamaLista;i++){
            if (listaAlumnos.get(i).getIdentificacion().equals(identificacion)){
                existe=true;
                break;
            }
        }
        return existe;
    }
    
    /**
     * Obtener alumno por Identificación
     * @param identificacion
     * @return Alumno un Alumno
     */
     public static Alumno obtenerAlumnoPorIdentificacion(String identificacion){
        Alumno unAlumno=null;
        for (int i=0;i<listaAlumnos.size();i++){
            if (listaAlumnos.get(i).getIdentificacion().equals(identificacion)){
               unAlumno=listaAlumnos.get(i);
               break;
            }
        }
        return unAlumno;
    }
     
     /**
      * Método que verifica si existe materia con determinado código
      * @param codigo
      * @return boolean, true o false
      */
     public static boolean existeMateria(String codigo){
         boolean existe=false;
         for(int i=0;i<listaMaterias.size();i++){
             if(listaMaterias.get(i).getCodigo().equals(codigo)){
                 existe=true;
                 break;
             }
         }
         return existe;
     }
     
     /**
      * Método que verifica si un alumno ya está inscripto
      * en determinada materia
      * @param unaInscripcion
      * @return 
      */
     
     public static boolean estaInscripto(Inscripcion unaInscripcion){
         boolean existe=false;
        String identificacion = unaInscripcion.getUnAlumno().getIdentificacion();
         String codigoMateria = unaInscripcion.getUnaMateria().getCodigo();
         for(int i=0;i<listaInscripciones.size();i++){
             if(listaInscripciones.get(i).getUnAlumno().getIdentificacion().equals(identificacion)
                     && listaInscripciones.get(i).getUnaMateria().getCodigo().equals(codigoMateria)){
                 existe=true;
                 break;
             }
         }
         return existe;
     }       
}
