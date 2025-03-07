package clases;
import java.util.ArrayList;

public class ClaseArrayList {
  // Como clase para este ejemplo solo hay una implementamos el patron Singleton
  private static ArrayList<Estudiante> estudiantes = new ArrayList<>();
  private static ClaseArrayList instancia;

  // Constructor privado
  private ClaseArrayList () {}

  // Metodo para obtener la instancia (Singleton)
  public ClaseArrayList getInstancia () {
    if (instancia == null) {
      instancia = new ClaseArrayList();
    }
    return instancia;
  }

  //getters y setters
  public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
    ClaseArrayList.estudiantes = estudiantes;
  }

  public ArrayList<Estudiante> getEstudiantes() {
    return estudiantes;
  }

  // Método para añadir estudiante
  public void addEstudiante(String nombre, int edad, double nota) {
    Estudiante estudiante = new Estudiante(nombre, edad, nota);
    estudiantes.add(estudiante);
    System.out.println("Estudiante " + nombre + " añadido correctamente a la clase.");
  }

  // Sobreescribimos el metodo toString() para imprimir los estudiantes
  @Override
  public String toString() {
    String resultado = "\tNOMBRE\t\t|\tEDAD\t|\tNOTA\n";
    for (Estudiante estudiante : estudiantes) {
      // Recorremos el arraylist y vamos sumando 
      resultado += estudiante.toString();
    }
    resultado += "\n\n";
    return resultado;
  }

  // Metodo para buscar un estudiante por nombre
  public Estudiante buscarEstudiante(String nombre) {
    for (Estudiante estudiante : estudiantes) {
      if(estudiante.getNombre().equalsIgnoreCase(nombre)) {
        return estudiante;
      }
    }
    System.out.println("No existe nigún estudiante con el nombre \"" + nombre + "\" en el ArrayList.");
    return null;
  }

  // Método para eliminar un estudiante por nombre
  public void eliminarEstudiante(String nombre) {
    // reutilizo el metodo de busqueda para la eliminación del registro
    Estudiante estudiante = buscarEstudiante(nombre);
    if (estudiante != null) {
      estudiantes.remove(estudiante);
      System.out.println("Estudiante con nombre \"" + estudiante.getNombre() + "\" eliminado del ArrayList.");
    } 
  }

}
