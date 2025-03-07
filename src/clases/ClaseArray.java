package clases;

// importamos la libreria de Arrays para poder hacer copias
import java.util.Arrays;

public class ClaseArray {
  private Estudiante[] estudiantes;

  public ClaseArray(Estudiante[] estudiantes) {
    this.estudiantes = estudiantes;
  }

  //getters y setters
  public void setEstudiantes(Estudiante[] estudiantes) {
    this.estudiantes = estudiantes;
  }

  public Estudiante[] getEstudiantes() {
    return estudiantes;
  }

  // Metodo para agregar un estudiante
  public void addEstudiante(Estudiante estudiante) {
    // Como los arrays en java tienen un numero fijo de elementos es necesario
    // que se haga un copia del array original añadiendo el nuevo registro
    estudiantes = Arrays.copyOf(estudiantes, estudiantes.length + 1); // copia con espacio para uno mas

    // Añadimos el nuevo estudiante a la ultima posicion del nuevo array
    estudiantes[estudiantes.length - 1] = estudiante;
    System.out.println("El estudiante \"" + estudiante.getNombre() + "\" se ha añadido correctamente al Array.");
  }

  // Sobreescribimos el metodo toString() para mostrar todos los estudiantes
  @Override
  public String toString() {
    // Este metodo es igual que el metodo para el arraylist
    String resultado = "\tNOMBRE\t\t|\tEDAD\t|\tNOTA\n";
    for (Estudiante estudiante : estudiantes) {
      resultado = resultado + estudiante.toString();
    }
    resultado = resultado + "\n\n";
    return resultado;
  }
}
