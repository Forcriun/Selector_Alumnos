import java.util.ArrayList;
import java.util.Random;

/**
 * Clase que nos permite seleccionar uno o varios alumnos 
 * aleatoriamente de entre un listado de ellos
 */
public class SelectorAlumno
{
    // Almacena los alumnos
    private ArrayList<String> alumnos; 

    /** 
     * Constructor de la clase
     */
    public SelectorAlumno()
    {
        alumnos = new ArrayList<String>();
    }

    /**
     * Añade un alumno
     */
    public void agregarAlumno(String nombreAlumno) 
    {
        alumnos.add(nombreAlumno);
    }

    /**
     * Muestra por pantalla los alumnos añadidos uno por línea
     */
    public void verListadoAlumnos()
    {        
        System.out.println("Listado de alumnos:");
        int numA = 1;
        for(String alumno : alumnos){
            System.out.println(alumno);
            numA++;
        }
    }

    /** 
     * Muestra por pantalla un alumno aleatoriamente. En caso de no haber alumnos
     * no muestra nada e informa del error.
     */
    public void seleccionarAlumnoAleatoriamente()
    {
        if(alumnos.size() > 0){
            Random random = new Random();
            int a = random.nextInt(alumnos.size());
            System.out.println(alumnos.get(a));
        }
        else{            

            System.out.println("Error");
        }
    }

    /**
     * Muestra por pantalla n alumnos seleccionados aleatoriamente. En caso de no haber 
     * alumnos suficientes no muestra nada e informa del error.
     */
    public void seleccionarNAlumnosAleatoriamente(int numeroDeAleatorios)
    {
        ArrayList<String> copia = (ArrayList<String>)alumnos.clone();
        if(numeroDeAleatorios > alumnos.size()){
            System.out.println("El número introducido es mayor al total de alumnos.");
        }
        else if(alumnos.size() > 0){
            Random random = new Random();
            int a = 0;
            int i = 0;
            while(i < numeroDeAleatorios){     
                a = random.nextInt(copia.size());
                System.out.println(copia.get(a));
                i++;
                copia.remove(a);
            }
        }
        else{
            System.out.println("No hay alumnos en la lista.");
        }
    }
}
