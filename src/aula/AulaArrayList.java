package aula;

import interfaces.Aula;
import java.util.ArrayList;

import modelo.Estudiante;

public class AulaArrayList implements Aula{
  // Como clase para este ejemplo solo hay una implementamos el patron Singleton
  private static ArrayList<Estudiante> estudiantes = new ArrayList<>();
  private static AulaArrayList instancia;

  // ArrayList con datos de prueba
  private static final ArrayList<Estudiante> DATOS_DEFAULT = new ArrayList<>() {{
    add(new Estudiante("Ana", 20, 8.5));
    add(new Estudiante("Juan", 22, 7.8));
    add(new Estudiante("Carlos", 21, 9.2));
    add(new Estudiante("Lucía", 23, 8.0));
    add(new Estudiante("Pedro", 19, 7.5));
  }};

  // Constructor privado
  private AulaArrayList () {}

  // Metodo para obtener la instancia (Singleton)
  public static AulaArrayList getInstancia () {
    if (instancia == null) {
      instancia = new AulaArrayList();
    }
    return instancia;
  }

  //getters y setters
  public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
    AulaArrayList.estudiantes = estudiantes;
  }

  public ArrayList<Estudiante> getEstudiantes() {
    return estudiantes;
  }

  // Método para añadir estudiante
  @Override
  public void addEstudiante(Estudiante estudiante) {
    // añadimos el estudiante con el metodo .add()
    estudiantes.add(estudiante);

    System.out.println("El estudiante \"" + estudiante.getNombre() + "\" se ha añadido correctamente al Array.\n\n");
  }

  // Sobreescribimos el metodo toString() para imprimir los estudiantes
  @Override
  public String toString() {
    // Utilizamos el metodo definido en la interfaz
    return imprimirAula(estudiantes);
  }

  // Metodo para buscar un estudiante por nombre
  public Estudiante buscarEstudiante(String nombre) {
    // Recorremos el arraylist buscando coincidencias en el nombre
    for (Estudiante estudiante : estudiantes) {
      if(estudiante.getNombre().equalsIgnoreCase(nombre)) {
        return estudiante;
      }
    }
    System.out.println("No existe nigún estudiante con el nombre \"" + nombre + "\" en el ArrayList.\n\n");
    return null;
  }

  // Método para eliminar un estudiante por nombre
  public void eliminarEstudiante(String nombre) {
    // reutilizo el metodo de busqueda para la eliminación del registro
    Estudiante estudiante = buscarEstudiante(nombre);
    if (estudiante != null) {
      estudiantes.remove(estudiante);
      System.out.println("Estudiante con nombre \"" + estudiante.getNombre() + "\" eliminado del ArrayList.\n");
    } 
  }

  // Método para cargar los datos de prueba
  public void cargarPrueba() {
    estudiantes = DATOS_DEFAULT;
    System.out.println("Datos de prueba cargados correctamente.\n\n");
  }

}
