package aula;

// importamos la interfaz
import interfaces.Aula;

// importamos la libreria de Arrays para poder hacer copias
import java.util.Arrays;

import modelo.Estudiante;

public class AulaArray implements Aula{
  private static final Estudiante[] DATOS_DEFAULT = {
    new Estudiante("Ana", 20, 8.5),
    new Estudiante("Juan", 22, 7.8),
    new Estudiante("Carlos", 21, 9.2),
    new Estudiante("Lucía", 23, 8.0),
    new Estudiante("Pedro", 19, 7.5)
  };
  private Estudiante[] estudiantes = {};
  private static AulaArray instancia;

  // Implementacion patron singleton
  private AulaArray() {
    super();
  }

  public static AulaArray getInstancia() {
    if (instancia == null) {
      instancia = new AulaArray();
    }
    return instancia;
  }

  //getters y setters
  public void setEstudiantes(Estudiante[] estudiantes) {
    this.estudiantes = estudiantes;
  }

  public Estudiante[] getEstudiantes() {
    return estudiantes;
  }

  // Metodo para agregar un estudiante
  @Override
  public void addEstudiante(Estudiante estudiante) {

    // Como los arrays en java tienen un numero fijo de elementos es necesario
    // que se haga un copia del array original añadiendo el nuevo registro
    estudiantes = Arrays.copyOf(estudiantes, estudiantes.length + 1); // copia con espacio para uno mas

    // Añadimos el nuevo estudiante a la ultima posicion del nuevo array
    estudiantes[estudiantes.length - 1] = estudiante;

    System.out.println("El estudiante \"" + estudiante.getNombre() + "\" se ha añadido correctamente al Array.\n\n");
  }

  // Sobreescribimos el metodo toString() para mostrar todos los estudiantes
  @Override
  public String toString() {
    // hacemos uso del metodo default definido en la interfaz
    // convertimos el array en arraylist para que funcione con la interfaz
    // ya que Collection no acepta arrays normales, pero sí el objeto iterable que nos
    // devuelve Arrays.asList()
    return imprimirAula(Arrays.asList(estudiantes));
  }

  // metodo para cargar los datos de prueba al array
  public void cargarPrueba(){
    estudiantes = DATOS_DEFAULT;
    System.out.println("Datos de prueba cargados correctamente.\n\n");
  }
}
