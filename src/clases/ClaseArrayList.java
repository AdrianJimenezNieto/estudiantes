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
    if (instancia == null) ´{
      instancia = new ClaseArrayList();
    }
    return instancia;
  }

  //getters y setters
  public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
    this.estudiantes = estudiantes;
  }

  public ArrayList<Estudiante> getEstudiantes() {
    return estudiantes;
  }

  // Métodos para añadir estudiante
  public void addEstudiante(String nombre, int edad, double nota) {
    Estudiante estudiante = new Estudiante(nombre, edad, nota);
    estudiantes.add(estudiante);
    System.out.println("Estudiante " + nombre + " añadido correctamente a la clase.");
  }

}
